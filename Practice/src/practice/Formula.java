package practice;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		
		// Q. 연산자, 항1, 항2 를 변수로 선언한 후 사칙연산이 수행 되게 구현하시오
		Scanner scan = new Scanner(System.in);
		
		// 연산자, 항1, 항2
		char operator = Character.toLowerCase(scan.next().charAt(0));		
		int operand1 = scan.nextInt();
		int operand2 = scan.nextInt();
		int result;
		
		switch(operator) {
			case 'x': result = operand1 * operand2;
			break;
			case '-': result = operand1 - operand2;
			break;
			case '+': result = operand1 + operand2;
			break;
			case '/': result = operand1 / operand2;
			break;
			
			default :
				result=0;
				System.out.print("Error");
				return;
		}
		
		
		System.out.println(operand1 + ""+ operator + ""+ operand2 + "="+ result);
	}

}
