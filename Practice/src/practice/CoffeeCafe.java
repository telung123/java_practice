package practice;

public class CoffeeCafe {
	String name;
	
	// 메뉴 가격
	int coffeePrice;
	int lattePrice;
	int income;
	
	public CoffeeCafe() {}
	
	public CoffeeCafe(String name, int coffeePrice, int lattePrice) {
		this.name = name;
		this.coffeePrice = coffeePrice;
		this.lattePrice = lattePrice;
	}
	
	public int take(String menu) {
		int cost = 0;
		int menuPrice = 0;
		
		switch(menu) {
			case "아메리카노":
				cost = coffeePrice;
				menuPrice = coffeePrice;
				break;
			case "라떼":
				cost = lattePrice;
				menuPrice = lattePrice;
				break;
		}
		
		income += cost; // 매출 증가		
		return menuPrice;
		
	}
	
	public void getIncome() {		
		System.out.println("\n"+ name + "카페의 총 수익 : "+ income);
		System.out.println(name + "카페의 아메리카노  : "+ coffeePrice + ", 라떼 : "+lattePrice);
	}

}
