package ifexample;

import java.util.Scanner;

public class MonthDayTest {

	public static void main(String[] args) {
		// 각 월에 따른 한달 날짜 수를 day 변수 값으로 출력하세요.
		// 단, 2월은 28일로 합니다.
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		int day; // 1,3,5,7,8,10,12
		
		switch(month) {
			case 2 : 
			day = 28;
			break;
			
			case 4: case 6: case 9: case 11:
			day = 30;
			break;	
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 30;
				break;
			
			default:
				System.out.println("Error");
				day = 0;
				return;
		}

		System.out.println(month + "월의 날짜 수는 : " + day + "일 입니다.");

	}

}
