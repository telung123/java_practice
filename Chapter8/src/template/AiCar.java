package template;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	

}
