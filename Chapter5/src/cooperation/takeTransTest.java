package cooperation;

public class takeTransTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("±è°¡ºó", 10000);
		Student student2 = new Student("½ÉµµÀº", 5000);
		Student james = new Student("James",10000);
		
		Bus bus400 = new Bus(400);
		Bus bus8100 = new Bus(8100);
		Subway subwayBrown = new Subway(6);
		Subway subwayGreen = new Subway(2);
		Taxi taxi9999 = new Taxi(9999);
		
		
		student1.takeBus(bus400);
		student1.takeSubway(subwayBrown);
		student2.takeBus(bus8100);
		james.takeTaxi(taxi9999);
		
		
		student1.getBalance();
		student2.getBalance();
		james.getBalance();
		
		
		bus400.showBusInfo();
		bus8100.showBusInfo();
		
		subwayBrown.showSubwayInfo();
		subwayGreen.showSubwayInfo();
		
		taxi9999.showTaxiInfo();
	}

}
