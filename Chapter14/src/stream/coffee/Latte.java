package stream.coffee;

public class Latte extends Decorator {

	// extends Decorator - Coffee 를 가져야 함
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing(); // 상위 클래스 Method 호출
		System.out.print(" Adding milk"); // 라떼 전용 기능 추가
	}
}
