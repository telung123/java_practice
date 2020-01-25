package interfaceex;

public interface Sell {
	
	public void sell();
	
	default void order() { // Buy 인터페이스와 동명의 Method
		System.out.println("판매 주문");
	}

}
