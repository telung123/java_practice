package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		// 부동소숫점 오류
		
		double dNum = 1;
		
		for ( int i = 0; i < 10000; i++) {
			dNum += 0.1;			
		}
		
		System.out.println(dNum); 
		// 출력 : 1001이 아닌, 1001.000000000159 이 출력됨. = 부동소숫점 오류.

	}

}
