package collection.treeset;

public class Member implements Comparable<Member>{
	
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
	
	
	@Override
	public int compareTo(Member member) {
//		return (this.memberId - member.memberId); // 오름차순 정렬 (양수 반환)
//		return (this.memberId - member.memberId) * (-1) // 내림차순 정렬
		
		// 만약 Member Name (String) 으로 비교 하고 싶을경우,
		// 원래 정의되어있는 String 객체의 compareTo 를 이용한다.
		return this.memberName.compareTo(member.memberName);
	}
	
	
	
	
}
