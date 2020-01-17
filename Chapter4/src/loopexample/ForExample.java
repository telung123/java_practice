package loopexample;

public class ForExample {

	public static void main(String[] args) {
				
		int sum = 0;
		
		for (int i = 0; i < 10; i=i+2 ) {
			sum += i;
			System.out.println(i);
		}
		
		System.out.println(sum);

	}

}
