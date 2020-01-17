package classpart;

import java.util.Scanner;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;		
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello! "+name);
	}
	
	public static int calcSum() {
		int sum = 0;
		
		for (int i = 0; i <=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static int calc(char oper, int num1, int num2) {
		int result = 0;

		switch(oper) {
			case 'x': result = num1 * num2; break;
			case '-': result = num1 - num2; break;
			case '+': result = num1 + num2; break;
			case '/': result = num1 / num2; break;
			default : 
				System.out.println("Error");				
		}
		
		
		return result;
	}
	

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		
		int numSum = addNum(num1, num2);
		System.out.println(numSum);
		
		sayHello("가빈");
		
		int sumNum = calcSum();
		System.out.println(sumNum);
		
		int oprTestInt = calc('+', 10, 8);
		System.out.println(oprTestInt);
	}
}
