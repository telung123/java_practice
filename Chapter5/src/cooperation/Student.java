package cooperation;

public class Student {
	
	String name;
	int money;
	
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 객체간 협력. 객체(Class)를 매개변수로 받으면 됨
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money -= 1800;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(3800);
		this.money -= 3800;
	}
	
	public void getBalance() {
		System.out.println(name + " 학생의 현재 잔액: "+ money+ " 원");
	}

}
