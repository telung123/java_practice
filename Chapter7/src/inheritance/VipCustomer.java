package inheritance;

public class VipCustomer extends Customer { // 상속
	
	double salesRatio; // VIP 고객에게만 할인율 적용
	
	public VipCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// 기본적으로 생략되어있는 하위클래스에 포함되는 super() 메소드. 상위클래스를 생성한다(1번)
		// 상위 클래스 생성 > 하위 클래스 생성의 순으로 호출
		// 만약, 상위클래스에 기본 생성자가 없는 경우 (매개변수가 있는 생성자만 존재하는 경우) 
		// 하위 클래스에서는 명시적으로 (2번) 상위클래스의 생성자를 호출해 주어야 한다.
		//1. super(); --> 상위클래스의 기본 생성자(default constructor 호출)
		
		/* 2.
		 * public VipCustomer(int customerID, String customerName) {
		 * 	super(int customerID, customerName); 
		 * }
		 * */
		
		grade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	
	// 상위 클래스의 Method override
	@Override
	public int calcPrice(int price) {		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio); // 할인율 적용
	}
	

	
	public static void main(String[] args) {
		Customer lee = new VipCustomer(0002, "김유신"); // 가능. 대신 Customer 의 인스턴스만 참조 가능.
		//VipCustomer kim = new Customer(0003, "가나다"); 불가. 하위클래스 타입으로 상위 클래스를 선언할 수 없다.
		
		String msg = lee.showCustomerInfo();
		System.out.println(msg);
	}
}
