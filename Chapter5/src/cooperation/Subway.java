package cooperation;

public class Subway {
	int number;
	int passengerCount;
	int cost;
	
	public Subway(int number) {
		this.number = number;
	}
	
	
	public void take(int cost) { // ���� Method
		this.cost += cost;
		this.passengerCount++;
	}

	public void showSubwayInfo() {
		System.out.println(number + "ȣ�� �°� �� :" + passengerCount + ", ���� : "+ cost+" ��");
	}
}
