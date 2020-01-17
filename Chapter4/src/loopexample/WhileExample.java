package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		int num = scan.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num;			
			num = scan.nextInt();
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
