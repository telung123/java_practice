package collection.treeset;

import java.util.Comparator;

public class MemberComparator implements Comparator<MemberComparator>{
	
	private int memberId;
	private String memberName;
	
	public MemberComparator() {}
	public MemberComparator(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	// getter, setter
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디 : " + memberId;
	}
	
	// 같은 멤버 검증
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MemberComparator) {
			MemberComparator member = (MemberComparator)obj;
			return (this.memberId == member.memberId);
		}

		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;	
	}
	
	
	
	@Override
	public int compare(MemberComparator member1, MemberComparator member2) {
		// 비교하여 양수(오름차순) / 음수(내림차순) 을 반환하는것으로 비교한다.
		return (member1.getMemberId() - member2.getMemberId());
		// Member name 오름차순 정렬
//		return member1.memberName.compareTo(member2.getMemberName());
	}
	
	
}
