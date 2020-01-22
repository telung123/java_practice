package objectcoop;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Cafe {
	public String cafeName;
	public int income;
	
	// HashMap 형태로 담기 위해 Map생성
	private Map<String, Integer> menuMap = new HashMap<String, Integer>();
	
	
	public Cafe(String name) {
		this.cafeName = name;
	}
	
	
	// 메뉴 Set
	public void setMenu(String name, Integer price) {
		menuMap.put(name, price);
	}
	
	// 메뉴 Get
	public String getMenuInfo(String name, Optional<Boolean> price) {
		String menuInfo = "";
		
		// Map iteration , 메뉴 find
		for (Map.Entry<String,Integer> entry : menuMap.entrySet()) {
			if ( entry.getKey() == name ) {
				menuInfo = price == null ? 
						menuInfo = "메뉴 : " + entry.getKey() + ", 가격 :" + entry.getValue() 
					  : String.valueOf(entry.getValue());
				break;
			}
		}			
		return menuInfo;
	} 
	
	
	public void take(String menu) { // 카페 income 증가
		int cost = Integer.parseInt(this.getMenuInfo(menu, Optional.of(true)));	
		this.income += cost;
	}
	
	public void getCafeIncome() { // 카페 income get
		System.out.println(cafeName + " 카페의 총 수입은 : "+ income + " 원 입니다.");		
	}
}
