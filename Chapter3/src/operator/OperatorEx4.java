package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		//비트연산자
		
		int num1 = 0B00001010; // 10
		int num2 = 0B00101101; // 5
		
		System.out.println("num1 : " +num1);
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 1); // 10
		System.out.println(num2 << 2); // 20 ( * 2의 2승)
		System.out.println(num2 << 3); // 40 ( * 2의 3승)
		
		
		System.out.println(num1 << 2);  
		
	}

}
