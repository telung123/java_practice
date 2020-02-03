package collection.treeset;


import java.util.Iterator;
import java.util.TreeSet;


public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();		
	}
	
	public void addMember(Member member) {
		treeSet.add(member);		
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if ( member.getMemberId() == memberId ) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("존재하지 않는 Member ID 입니다.");
		return false;		
	}
	
	
	public Member getMember(String memberName) {		
		Iterator<Member> ir = treeSet.iterator();
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
		for (Member member : treeSet) {
			System.out.println(member);
		}		
	}
}
