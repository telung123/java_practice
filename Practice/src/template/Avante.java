package template;

public class Avante extends Car {

	public Avante(String carName) {
		this.setCarName(carName);
	}

	@Override
	public void drive() {
		System.out.println(this.getCarName() + " 슥슥 달려요");
	}

	@Override
	public void stop() {
		System.out.println(this.getCarName() + " 슥슥 멈춥니다");
	}
}
