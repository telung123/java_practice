package polymorphism;

public class GoldCustomer extends Customer {
	
	public GoldCustomer(String name) {
		super(name);
	}
	
	public void init() {
		grade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
}
