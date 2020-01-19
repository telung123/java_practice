package cooperation;

public class Subway {
	int number;
	int passengerCount;
	int cost;
	
	public Subway(int number) {
		this.number = number;
	}
	
	
	public void take(int cost) { // ½ÂÂ÷ Method
		this.cost += cost;
		this.passengerCount++;
	}

	public void showSubwayInfo() {
		System.out.println(number + "È£¼± ½Â°´ ¼ö :" + passengerCount + ", ¼öÀÔ : "+ cost+" ¿ø");
	}
}
