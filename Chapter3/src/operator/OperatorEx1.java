package operator;

public class OperatorEx1 {

	public static void main(String[] args) {

		int num1 = -10;
		int num2 = 20;
		
		System.out.println(+num1); // + 부호연산자는 값 유지됨
		System.out.println(+num2);
		
		System.out.println(-num1); // - 부호연산자는 음수/양수가 변환됨
		System.out.println(-num2);		
	}

}
