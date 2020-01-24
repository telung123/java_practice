package template;

public class Sonata extends Car {
	
	// Constructor
	public Sonata(String carName) {
		this.setCarName(carName);
	}

	@Override
	public void drive() {
		System.out.println(this.getCarName() + " 슁슁 달립니다.");
	}
	
	@Override
	public void stop() {
		System.out.println(this.getCarName() + " 슁슁 멈춥니다.");
	}

}
