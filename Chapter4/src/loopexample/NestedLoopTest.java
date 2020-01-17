package loopexample;

public class NestedLoopTest {

	public static void main(String[] args) {
		// for, while 문을 이용해 구구단 작성
		
		for ( int i = 1; i <10; i++ ) {
			for (int k = 1; k <10; k++) {
				System.out.println(i+" X "+ k + " = "+ (i*k));
			}
			System.out.println();
		}
		
		System.out.println("for 구구단 종료!!!!!!!!!!\n");
		
		
		int dan = 2;
		int count = 1;
		
		while(dan < 10) {			
			count = 1;
			
			while( count <10 ) {
				System.out.println(dan +" X "+ count + " = "+ (dan * count));
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
