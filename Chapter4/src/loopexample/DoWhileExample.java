package loopexample;

import java.util.Scanner;

public class DoWhileExample {

	/*
	 * 우선 수행 된 후, 조건이 체크되어야 할 경우 = doWhile
	 * 조건 체크 후 수행해야 하는 경우 = while
	 * */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		
		do {
			sum += num;
			num = scan.nextInt();
		} while ( num != 0 ) ;

		System.out.println(sum);
		System.out.println(num);
	}

}
