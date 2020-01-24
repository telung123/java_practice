package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	
	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer kim = new Customer("김가빈");
		Customer cha = new Customer("차차차");
		
		Customer lee = new GoldCustomer("이랄라");
		Customer choi = new GoldCustomer("최가나다");
		
		Customer sim = new VipCustomer("심도은", 1000);
		
		customerList.add(kim);
		customerList.add(cha);
		customerList.add(sim);
		customerList.add(lee);
		customerList.add(choi);
		
		for (Customer customer:customerList) {
			int cost = customer.calcPrice(10000);
			System.out.println(customer.getCustomerInfo());
			System.out.println("지불금액:"+cost);
			System.out.println("\n============================================================");
		}
	}

}
