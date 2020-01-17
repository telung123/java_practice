package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(score);
		System.out.println(++score); //101
		System.out.println(score++); // 101 출력되지만, 실제 값은 102로 변경됨
		System.out.println(score);
		
		
		int num1 = 10;
		int i = 2;
		
		boolean isValid = ( (num1  - num1 + 10) < 10 ) && ( (i = i+2) <10);		
		System.out.println(isValid);
		
		
	}

}
