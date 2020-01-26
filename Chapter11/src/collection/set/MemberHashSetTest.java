package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		Member memberA = new Member(0, "김가빈");
		Member memberB = new Member(1, "심도은");
		Member memberC = new Member(2, "갈랄라");
		Member memberD = new Member(2, "누나나"); // ID 가 같은 Member 생성
		
		manager.addMember(memberA);
		manager.addMember(memberB);
		manager.addMember(memberC);
		manager.addMember(memberD); // ID 중복처리 (equals, hashCode override) 로 추가 안됨
		
		
		manager.showMember(); // 전체 멤버 출력
		
		System.out.println("\n---이름으로 Member 찾기---");
		System.out.println(manager.getMember("심도은"));
		System.out.println(manager.getMember("기나다"));
		
		System.out.println("\n---ID로 Member 삭제하기---");
		manager.removeMember(4);
		manager.removeMember(2);
		manager.showMember(); // 삭제 후 전체 멤버 출력
		

	}

}
