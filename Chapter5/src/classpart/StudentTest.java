package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		// 학생 Class 생성
		Student james = new Student();
		james.studentName = "James";
		james.address = "서울 강남";
		
		james.getStudentInfo();
		
		Student kim = new Student();
		kim.studentName = "김가빈";
		kim.address = "서울 마포구";
		
		kim.getStudentInfo();
	}

}
