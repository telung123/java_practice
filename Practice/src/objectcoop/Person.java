package objectcoop;

import java.util.Optional;

public class Person {
	private String name;
	public int money;
	
		
	public Person(String name, int money) {
		this.name = name;
		this.money = money;		
	}
	
	// 사용자 카페 이용
	public void useCafe(Cafe cafe, String menu) {
		cafe.take(menu);
		int cost = Integer.parseInt(cafe.getMenuInfo(menu, Optional.of(true)));
		
		// 사용자 잔액 변경
		this.money -= cost;
	}
	
	
	public void getPersonBalance() {
		System.out.println(name + " 님의 잔액은 " + money + " 원 입니다.");
	}
}
