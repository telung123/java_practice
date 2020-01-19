package practice;

public class CoffeeTest {

	public static void main(String[] args) {
		
		// 사람 생성
		CoffeePerson kim = new CoffeePerson("김졸려", 10000);
		CoffeePerson lee = new CoffeePerson("이피곤", 15000);
		
		// 카페 생성
		CoffeeCafe star = new CoffeeCafe("별다방", 4000, 5000);
		CoffeeCafe bean = new CoffeeCafe("콩다방", 3000, 4500);
		
		
		kim.takeCoffee(star, "아메리카노");
		lee.takeCoffee(bean, "라떼");
		
		star.getIncome();
		bean.getIncome();		
		
		kim.getBalance();
		lee.getBalance();
	}

}
