package loopexample;

public class ContinueTest {

	public static void main(String[] args) {
		// Q. 구구단을 출력하되 짝수 단만 출력하면서,
		//    단보다 곱하는 수가 작거나 같을때까지만 출력하시오
		
		for (int dan = 2; dan < 10; dan++) {
			if (dan%2 != 0) continue;
			
			for (int count = 1; count < 10; count++) {
				if (dan < count ) break;
				System.out.println(dan + " X " + count + " = " + (dan*count));
			}
			System.out.println();
		}		

	}

}
