package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		System.out.println("========================================");
		Buy buyer = customer; // Buy 타입으로 캐스팅.
		buyer.buy(); // .sell() 메서드는 호출할 수 없다.
		buyer.order(); // Buy 인터페이스의 order() 가 호출되는게 아님에 유의하자. 메서드 호출주소는 인스턴스에 따름.
		
		Sell seller = customer; // Sell 타입으로 캐스팅
		seller.sell(); // .buy() 메서드는 호출할 수 없다
		
		// 다운 캐스팅
		if ( buyer instanceof Customer ) {			
			((Customer) buyer).sell(); 
		}
	}

}
