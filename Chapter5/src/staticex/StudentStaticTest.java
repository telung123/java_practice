package staticex;

public class StudentStaticTest {

	public static void main(String[] args) {
		StudentStatic kim = new StudentStatic("김가빈");
		// System.out.println(kim.serialNum);
		// 위처럼 참조 변수로 Static 변수를 참조하는 것은 옳지 않음.
		// static 변수는 객체의 생성과 무관하기 때문에, 노란줄(오류) 뜸.
		// 아래처럼 Class 에 직접 접근해서 받아야 함
		// System.out.println(StudentStatic.serialNum);
		
		StudentStatic sim = new StudentStatic("심연정");		

		System.out.println(StudentStatic.getSerialNum());
		
		System.out.println();
		
		// 학번 가져오기
		System.out.println(kim.getStudentId());
		System.out.println(sim.getStudentId());

	}

}
