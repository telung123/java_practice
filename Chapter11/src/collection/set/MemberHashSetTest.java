package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member member = new Member(100, "김가빈");
		Member member2 = new Member(200, "심도은");
		Member member3 = new Member(300, "갈랄라");
		// 아래 Member 는 추가되지 않는다 (아이디가 같은 경우를 equals 테스트조건으로 작성했기 때문임)
		Member member4 = new Member(300, "뉴냐냐");
		
		manager.addMember(member);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		
		manager.showAllMember();
		
		manager.removeMember(1000);
		manager.removeMember(300);

		manager.showAllMember();
				

	}

}
