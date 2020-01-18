package practice;

// Class 생성 실습2

public class Order {
	String orderNum;
	String orderPrdNum;
	String orderDate;
	
	String customerId;
	String customerName;
	String address;
	
	public void getOrderInfo() {
		System.out.println("주문번호 : "+orderNum);
		System.out.println("주문자 아이디 : "+ customerId);
		System.out.println("주문 날짜 : "+ orderDate);
		System.out.println("주문자 이름 : "+customerName);
		System.out.println("주문 상품 번호 : "+orderPrdNum);
		System.out.println("배송 주소: "+address);
	}

	public static void main(String[] args) {

		Order order1 = new Order();
		
		order1.orderNum = "20180312001";
		order1.orderPrdNum = "PD345-12";
		order1.customerId = "telung123";
		order1.customerName = "김가빈";
		order1.orderDate="2018-12-10";
		order1.address = "서울 마포";
		
		order1.getOrderInfo();
	}

}
