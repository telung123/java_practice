package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee =  new Customer(1000, "이순신");
		customerLee.bonusPoint = 1000;
		
		VipCustomer customerKim = new VipCustomer(1001, "김가빈");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee +" 원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim +" 원 입니다.");
		
		
		/**
		 * 아래 처럼 Type을 상위 클래스, 인스턴스를 하위클래스로 선언하고
		 * 같은 이름의 Method override 가 작용했을 경우,
		 * 메소드가 호출되면 Type(Customer)이 아닌 인스턴스(VipCustomer) 의 Virtual method를 호출하게 된다.
		 * 재정의 되었기 때문에, 인스턴스에 기반하여 호출됨!
		 */
		Customer customerSim = new VipCustomer(1003, "심도은");
		customerSim.bonusPoint = 10000;
		
		int priceSim = customerSim.calcPrice(10000);
		System.out.println(customerSim.showCustomerInfo() + "지불금액은 " + priceSim +" 원 입니다.");
		
	}

}

