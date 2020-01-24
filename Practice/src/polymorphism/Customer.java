package polymorphism;

public class Customer {
	protected String name;
	protected String grade;
	
	private static int idSequence = 0; 
	protected int id;
	protected int bonusPoint;
	
	protected double salesRatio;
	protected double bonusRatio;
	
	
	public Customer() {
		init();
	}
	
	public Customer(String name) {
		// 기본 공통사항 초기화 (생성자 초기화)
		this.name = name;
		id = idSequence;
		idSequence++; // id 시퀀스 증식
		init();
	}
	
	public void init() {
		// 고객별 차등 조건 지정 - init 함수 
		grade = "SILVER";
		bonusRatio = 0.01;
		salesRatio = 0;
	}
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	
	// method
	public String getCustomerInfo() {
		return name + "고객님, 등급:"+grade+", 아이디: "+ id + "\n포인트: "+ bonusPoint + ", 적립율:"+bonusRatio+", 할인율: "+ salesRatio;
	}
	
	public int calcPrice(int price) { // 가격 계산
		bonusPoint += price * bonusRatio; // 포인트 적립
		return price - (int)(price * salesRatio);
	}
	
}
