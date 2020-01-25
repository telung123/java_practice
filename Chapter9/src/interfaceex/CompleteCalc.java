package interfaceex;

public class CompleteCalc extends Calculator {

	// 상위 클래스에서 선언하지 않은 추상클래스 2개 구현.
	@Override
	public int times(int num1, int num2) {		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if ( num2 == 0 ) return ERROR; // 분모가 0일때 Error 반환
		return num1/ num2;
	}
	
	
	// 디폴트 Override
	@Override
	public void description() {
		System.out.println("재정의한 디폴트");
	}
	

	public void showInfo() {
		System.out.println("모두 구현 했음");
	}
	
}
