package lambda;

interface PrintString {
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr); // 매개변수로 함수가 담긴 변수 전달
		
		PrintString test = returnString();
		test.showString("2");
		
	}
	
	
	public static void showMyString(PrintString p) {
		p.showString("ddd");
	}
	
	
	// 함수 구현부를 람다Type 으로 반환
	public static PrintString returnString() {
		return s-> System.out.println(s + "!!!");
	}

}
