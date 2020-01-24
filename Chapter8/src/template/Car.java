package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("차의 시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("차의 시동을 끕니다.");
	}
	
	public void washCar() {}; // Hook method.
	
	final public void run() { // 틀이 되는 시나리오가 변하지 않게 final 처리. Override 불가
		startCar();
		drive();
		stop();
		turnOff();
		// (Hook method) 시나리오에는 포함되어 있으나, 아무 기능이 없으므로 하위클래스에게 재정의하면 기능이 추가되는 메서드
		// 기능의 확장이 가능해진다.
		washCar(); 
	}
}
