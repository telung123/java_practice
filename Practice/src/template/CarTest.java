package template;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata("소나타"));
		carList.add(new Avante("아반떼"));
		
		for (Car car : carList) {
			car.run();
		}
	}

}
