package lambda;

// 람다식 interface annotation 추가
@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
	
	// 함수형 Interface - 메소드 1개 이상 선언 불가 
	//int add(int x, int y); <- 이렇게 두번째 method를 선언했다고 쳤을때 익명으로 넘어오는 매개변수 x, y 가 어떤 함수랑 매핑되는지 알수없기 때문임!!
	// 익명으로 선언된다 = 메소드는 하나만 가능하다
}
