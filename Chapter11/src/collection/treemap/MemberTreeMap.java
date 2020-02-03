package collection.treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

class MyComparator implements Comparator<Member> {
	@Override
	public int compare(Member member1, Member member2) {	
		System.out.println("Compare :: "+(member1.getMemberId() - member2.getMemberId()));
		return member1.getMemberId() - member2.getMemberId() * (-1);
	}
}


public class MemberTreeMap {
	
	// Integer - member ID
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);		
	}
	
	
	public boolean removeMember(int memberId) {
		
		if ( treeMap.containsKey(memberId) ) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("존재하지 않는  Member입니다.");
		return false;
	}
	
	
	public void showAllMember() {
		
//		hashMap.keySet().iterator();
//		hashMap.values().iterator() -> collection 반환.
		
		// Iterator  순회 대상 Type - memberId(Integer)
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while ( ir.hasNext() ) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	

}
