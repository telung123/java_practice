package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	// Integer - member ID
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);		
	}
	
	
	public boolean removeMember(int memberId) {
		
		if ( hashMap.containsKey(memberId) ) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("존재하지 않는  Member입니다.");
		return false;
	}
	
	
	public void showAllMember() {
		
//		hashMap.keySet().iterator();
//		hashMap.values().iterator() -> collection 반환.
		
		// Iterator  순회 대상 Type - memberId(Integer)
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while ( ir.hasNext() ) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	

}
