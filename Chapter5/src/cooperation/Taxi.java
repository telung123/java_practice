package cooperation;

public class Taxi {
	int number;
	int cost;
	int passengerCount;
	
	public Taxi(int number) {
		this.number = number;
	}
	
	
	public void take(int cost) {
		this.cost += cost;
		this.passengerCount++;		
	}
	
	public void showTaxiInfo() {
		System.out.println(number + "¹ø ÅÃ½ÃÀÇ ½Â°´ ¼ö : "+passengerCount+ ", ÃÑ¼öÀÔ : "+cost);
	}
}
