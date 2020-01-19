package cooperation;

public class Student {
	
	String name;
	int money;
	
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // ��ü�� ����. ��ü(Class)�� �Ű������� ������ ��
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
		System.out.println(name + " �л��� ���� �ܾ�: "+ money+ " ��");
	}

}
