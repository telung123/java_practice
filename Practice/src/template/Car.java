package template;

public abstract class Car {
	private String carName;
	public abstract void drive();
	public abstract void stop();
	
	
	// public method
	public void start() {
		System.out.println(carName + " 시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println(carName + " 시동을 끕니다.");
	}
	
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		System.out.println("=================================");
	}
	
	// Getter / Setter
	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
}
