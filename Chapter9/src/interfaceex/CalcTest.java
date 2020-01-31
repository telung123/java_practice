package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		
		// Calc interface,
		// Calculator Abstract
		// CompleteCalc 만 생성 가능
		
		// 주로 인터페이스 Type 으로 선언됨
		Calc calc = new CompleteCalc();

		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1,n2));
		System.out.println(calc.substract(n1,n2));
		System.out.println(calc.times(n1,n2));
		System.out.println(calc.divide(n1,n2));
	
		// 다운캐스팅
		if ( calc instanceof CompleteCalc ) {		
			CompleteCalc calcCom = (CompleteCalc)calc;
			calcCom.showInfo();
		}
		
		calc.description();
		int[] arr = {1,2,3,4,5};
		int totalCnt = Calc.total(arr); // 인스턴스 생성과 무관하게 가져다 쓸 수있음 (Static)
		System.out.println(totalCnt);

	}

}
