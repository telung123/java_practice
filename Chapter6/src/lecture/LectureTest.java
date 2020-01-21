package lecture;

public class LectureTest {

	public static void main(String[] args) {
		
		Student lee = new Student(0, "Lee");
		lee.addSubject("외국어", 90);
		lee.addSubject("수학", 100);
		lee.showStudentInfo();
		System.out.println("=================================");
		
		Student kim = new Student(1, "Kim");
		kim.addSubject("외국어", 100);
		kim.addSubject("수학", 40);
		kim.showStudentInfo();
		

	}

}
