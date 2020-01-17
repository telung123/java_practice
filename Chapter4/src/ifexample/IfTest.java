package ifexample;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// 성적에 따라 학점 부여하기
		
		// 100 - 90 : A
		// 89-80 : B
		// 79-70 : C
		// 69-60 : D
		// 59 이하 : F
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade = 'F';
		
		if ( score > 89) {
			grade = 'A';			
		} else if ( score > 79 ) {
			grade = 'B';			
		} else if ( score > 69) {
			grade = 'C';					
		} else if ( score > 59) {
			grade = 'D';			
		}
		
		
		System.out.println("점수 : " + score + " / 등급 : " + grade);

	}

}
