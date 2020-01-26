package collection.treeset;

public class Member implements Comparable<Member> {
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
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
		if (obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId);
		}

		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;	
	}
	
	
	
	@Override // TreeSet 을 사용할 경우 반드시 필요함
	public int compareTo(Member member) {
		
		// this 와 매개변수 객체를 비교.
		// 비교하여 양수(오름차순) / 음수(내림차순) 을 반환하는것으로 비교한다.
		// return (this.memberId - member.memberId);
		// return (this.memberId - member.memberId) * (-1); 내림차순 정렬 
		
		// 이름으로 정렬
		return this.memberName.compareTo(member.getMemberName());
	}
	
	
}
