package collection.treemap;



public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberF = new Member(4, "루라라");
		Member memberA = new Member(0, "김가빈");
		Member memberB = new Member(1, "심도은");
		Member memberC = new Member(2, "갈랄라");
		
		Member memberD = new Member(2, "누나나"); // ID 가 같은 Member 생성 
		Member memberE = new Member(2, "ddd"); // ID 가 같은 Member 생성 - 덮어씀
		
		manager.addMember(memberA);
		manager.addMember(memberF);
		manager.addMember(memberB);
		manager.addMember(memberC);
		manager.addMember(memberD); // ID 중복처리 (equals, hashCode override) 로 추가 안됨
		manager.addMember(memberE); // ID 중복처리 (equals, hashCode override) 로 덮어씀
		
		
		
		manager.showAllMember();
		
		
		
		
		System.out.println("\n---ID로 Member 삭제하기---");
		manager.removeMember(4);
		manager.removeMember(2);
		manager.showAllMember(); // 전체 멤버 출력
		
		

	}

}
