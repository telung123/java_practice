package interfaceex;

// 인터페이스 상속 : extends X implements
// 총 4개의 추상 메서드 중 2개만 구현하기 때문에 추상 Class로 선언
public abstract class Calculator implements Calc {


	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1- num2;
	}

	

}
