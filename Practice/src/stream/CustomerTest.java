package stream;

import java.util.ArrayList;
import java.util.List;

class CompareCustomer implements Comparable<Customer> {
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class CustomerTest {

	public static void main(String[] args) {

		// 고객생성
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer kim = new Customer("김가빈", 30);
		Customer sim = new Customer("심도은", 33);
		Customer child = new Customer("얼라", 14);
		Customer child2 = new Customer("얼라2", 10);
		
		customers.add(kim);
		customers.add(sim);
		customers.add(child);
		customers.add(child2);
		
		
		// 고객 명단 출력
		customers.stream().forEach(v-> System.out.println(v));
		
		// 고객명단 출력(자체 toString 이용)
		System.out.println(customers);
		
		// 총 비용 출력
		int total = customers.stream().mapToInt(c->c.getCost()).sum();
		System.out.println("TOTAL : "+ total);
		
		// 고객 이름 정렬(20세 이상인 사람만 가져옴)
		customers.stream().filter(c-> c.getAge() >= 20).map(c->c.getName()).sorted().forEach(v->{
			System.out.println(v);
		});
		
	}

}
