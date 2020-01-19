package cooperation;

public class Bus {
	int number;
	int passengerCount;
	int cost;
	
	public Bus(int number) {
		this.number = number;
	}
	
	
	public void take(int cost) { // ½ÂÂ÷ Method
		this.cost += cost;
		this.passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(number + "¹ø ¹ö½º ½Â°´ ¼ö :" + passengerCount + ", ¼öÀÔ : "+ cost+" ¿ø");
	}
}
