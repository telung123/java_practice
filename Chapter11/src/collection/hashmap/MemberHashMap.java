package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>();
	}
	
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);		
	}
	
	public boolean removeMember(int memberId) {
		if ( hashMap.containsKey(memberId) ) { // Map 에서 Key 검색
			hashMap.remove(memberId);
			return true;			
		}
		System.out.println("존재하지 않는 Member ID 입니다");
		return false;
	}
	
	
	public void showAllMember() {
		 
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while( ir.hasNext() ) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}
	
	public String showAllKeys() {
		// .keySet - 모든 key 를 Set 타입으로 반환. (Set type)
		return hashMap.keySet().toString();		
	}
	
	public String showAllValues() {
		// .keySet - 모든 value 를 컬렉션타입으로 반환.
		return hashMap.values().toString();
	}

}
