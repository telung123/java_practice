package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		
		// 3의 배수만 출력		
		for(int num = 1; num <= 100; num++) {
			if ( num%3 != 0 ) continue;
			System.out.println(num);
		}
	}

}
