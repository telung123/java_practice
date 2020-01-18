package reference;

public class StudentTest {
	
	static Student kim = new Student("김가빈", 0);
	static Student cha = new Student("차성숙", 1);
	
	public static void main(String[] args) {
		kim.setStudentScore("korea", 100);
		kim.setStudentScore("math", 70);

		cha.setStudentScore("korea", 30);
		cha.setStudentScore("math", 90);
		
		kim.getStudentInfo();
		cha.getStudentInfo();
	}

}
