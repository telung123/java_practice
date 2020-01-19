package practice;

public class DateCheck {
	
	private int day;
	private int month;
	private int year;
	private int leapYear = 28;
	private boolean isValid = false;
	private String message = "";
	
	
	public boolean dateValid() { // 날짜 유효성 검증		
		if ( year > 1900 && year < 3000 ) {
			isValid = true;
		} else {
			message = "너무 작거나 큰 년도를 입력하였습니다.";
			return false;
		}
		
		if ( month > 0 && month < 13) {
			isValid = true;
		} else {
			message = "너무 작거나 큰 월을 입력하였습니다.";
			return false;
		}
		
		if ( day > 0 && day <32 ) isValid = true;

		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if( day <= 31 ) {
					isValid = true;
				} else {
					message = "올바른 '일'을 입력하세요.";
					return false;
				}
				break;
				
			case 4: case 6: case 9: case 11: 
				if( day <= 30 ) {
					isValid = true;
				} else {
					message = "올바른 '일'을 입력하세요.";
					return false;
				}
				break;				
				
				
			case 2: // 윤년 검증			
				if (year%4 == 0) {
					if (year%100 == 0) { // 평년
						leapYear = (year%400 ==0 ) ? 29:28; 
					}
				}
				
				
				if ( day > leapYear) {
					message = "올바른 '일'을 입력하세요.";
					return false; // 2월 일때 29일을 초과하면 False				
				} else {
					isValid = true;
				}				
		}
		
		return isValid; 
	}
	
	
	
	public void getDate() { // 날짜 출력
		System.out.println("입력한 날짜 값 : "+ year+ " 년 "+ month+ "월 " + day+ "일");
	}
	
	public void setDate(int day,int month, int year) { // 날짜 셋팅, 유효성 검증에 따른 메시지 출력
		this.day = day;
		this.month = month;
		this.year = year;
		
		boolean isValid = dateValid();	

		if ( !isValid ) {
			System.out.println(message);
		} else {
			System.out.println(year + "년 " + month + "월 " + day+"일");
		}
	}

	
	public static void main(String[] args) {

		DateCheck myDate = new DateCheck();
		myDate.setDate(30, 6, 2019);		
		
	}

}
