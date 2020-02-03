package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();		
	}
	
	
	public void addMember(Member member) {
		hashSet.add(member);		
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		
		while( ir.hasNext() ) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;				
			}
		}
		
		System.out.println("해당 Member Id 에 일치하는 멤버가 존재하지 않습니다.");
		return false;		
	}
	
	
	public void showAllMember() {
		for ( Member member : hashSet) {
			System.out.println("멤버 : " + member);
		}
		System.out.println();
	}

	
}
