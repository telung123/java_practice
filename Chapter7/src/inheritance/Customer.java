package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName; // protected : 하위 클래스에는 public, 외부 클래스에는 private	
	
	protected String grade;	
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() { // 디폴트 생성자에서는 주로 멤버변수의 초기화를 한다.
		grade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + grade + " 이며, " + "적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}

}
