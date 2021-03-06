package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		Member memberA = new Member(0, "김가빈");
		Member memberB = new Member(1, "심도은");
		Member memberC = new Member(2, "갈랄라");
		
		manager.addMember(memberA);
		manager.addMember(memberB);
		manager.addMember(memberC);

		
		manager.showMember(); // 전체 멤버 출력		
		System.out.println("");
		
		
		// Comparator 비교 객체		
		MemberTreeSetComp treeSet = new MemberTreeSetComp();
		MemberComparator member1 = new MemberComparator(100, "심도은");
		MemberComparator member2 = new MemberComparator(200, "김가빈");
		
		treeSet.addMember(member1);
		treeSet.addMember(member2);
		
		treeSet.showMember();

	}

}
