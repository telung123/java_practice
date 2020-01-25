package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");		
	}

	@Override
	public void order() {
		System.out.println("Customer order");
		// 아래처럼 Buy 의 order 를 사용하겠다고 해도 됨.
		// Buy.super.order();
	}
	
	
	public void sayHello() {
		System.out.println("안녕하세요");
	}

}
