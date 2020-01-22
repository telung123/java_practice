package inheritance;

public class VipCustomer extends Customer { // 상속
	
	double salesRatio; // VIP 고객에게만 할인율 적용
	
	public VipCustomer() {
		// 기본적으로 생략되어있는 하위클래스에 포함되는 super() 메소드. 상위클래스를 생성한다
		// 만약, 상위클래스에 기본 생성자가 없는 경우, 하위 클래스에서는 명시적으로 2번 처럼 상위클래스의 생성자를 호출해 주어야 한다.
		super(); 
		grade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

}
