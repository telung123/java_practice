package equals;

public class Date {
	
	public int year;
	public int month;
	public int day;
	
	public Date (int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;		
	}
	
	
	public String getDate() {
		return year + "년 " + month + "월 " + day + " 일";		
	}


	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Date ) {
			Date date = (Date)obj;			
			if ( date.year == this.year && date.month == this.month && date.day == this.day ) {
				return true;
			}
		}
					
		return false;
		
	}


	@Override
	public int hashCode() {
		String date = year +""+month+""+day;		
		return Integer.parseInt(date);
	}
	
	
	
	public static void main(String[] arg) {
		
		Date myDate = new Date(2019, 10, 11);
		Date myDate2 = new Date(2019, 10, 11);
		
		System.out.println(System.identityHashCode(myDate));
		System.out.println(System.identityHashCode(myDate2));
		
		System.out.println(myDate.equals(myDate2));
		
		System.out.println(myDate.hashCode());
		System.out.println(myDate2.hashCode());
		System.out.println("hashCode 비교 : " + (myDate.hashCode() == myDate2.hashCode()));
		
		
		
	}

}
