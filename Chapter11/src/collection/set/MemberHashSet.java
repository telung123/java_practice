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
		while(ir.hasNext()) {
			Member member = ir.next();
			if ( member.getMemberId() == memberId ) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("존재하지 않는 Member ID 입니다.");
		return false;		
	}
	
	
	public Member getMember(String memberName) {		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if ( member.getMemberName() == memberName ) {
				return member;
			}
		}
		
		System.out.println("존재하지 않는 멤버명입니다.");
		return null;		
	}
	
	
	// 모든 member 출력
	public void showMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}		
	}
}
