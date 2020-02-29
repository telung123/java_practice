package stream.coffee;

// 모두 구현되어있지만, Abstract 로 선언하는 경우 = 상속받기 위함
public abstract class Decorator extends Coffee {
	
	// Decorator 는 혼자 생성될 수 없음.
	// Coffee 처럼 원재료가 필요
	Coffee coffee;
	
	public Decorator (Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing(); 
	}

}
