package dateEquals;

class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof MyDate ) {
			MyDate date = (MyDate)obj; // Object 원형으로 넘어옴. 업캐스팅
			if ( date.year == this.year 
				&& date.month == this.month
				&& date.day == this.day ) 
			{	
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		String date = year + "" + month + "" + day;
		return Integer.parseInt(date);
	}
	
}

public class DateEqualsTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(2020, 2, 1);
		MyDate date2 = new MyDate(2020, 2, 1);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode() == date2.hashCode());
	}

}
