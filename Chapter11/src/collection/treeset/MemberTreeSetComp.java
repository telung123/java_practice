package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSetComp {

	private TreeSet<MemberComparator> treeSet;
	
	
	// Comparator 비교시, 디폴트 생성자에 반드시 new Type 선언해야 함
	public MemberTreeSetComp() {
		treeSet = new TreeSet<MemberComparator>(new MemberComparator());
	}
	
	public void addMember(MemberComparator member) {
		treeSet.add(member);		
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<MemberComparator> ir = treeSet.iterator();
		while(ir.hasNext()) {
			MemberComparator member = ir.next();
			if ( member.getMemberId() == memberId ) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("존재하지 않는 Member ID 입니다.");
		return false;		
	}
	
	
	public MemberComparator getMember(String memberName) {		
		Iterator<MemberComparator> ir = treeSet.iterator();
		while(ir.hasNext()) {
			MemberComparator member = ir.next();
			if ( member.getMemberName() == memberName ) {
				return member;
			}
		}
		
		System.out.println("존재하지 않는 멤버명입니다.");
		return null;		
	}
	
	
	// 모든 member 출력
	public void showMember() {
		for (MemberComparator member : treeSet) {
			System.out.println(member);
		}		
	}
}
