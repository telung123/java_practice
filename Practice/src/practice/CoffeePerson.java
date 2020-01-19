package practice;

public class CoffeePerson {
	String name;
	int money;
	
	public CoffeePerson(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeCoffee(CoffeeCafe cafe, String menu) {
		int cost = cafe.take(menu);
		money -= cost;
	}
	
	public void getBalance() {
		System.out.println(name + "님의 잔액 : "+ money);
	}
}
