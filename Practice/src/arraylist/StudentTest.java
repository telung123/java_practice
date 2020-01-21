package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student("Lee");
		lee.addReadBook("태백산맥1");
		lee.addReadBook("태백산맥2");
		
		Student kim = new Student("Kim");
		kim.addReadBook("토지1");
		kim.addReadBook("토지2");
		kim.addReadBook("토지3");
		
		Student cho = new Student("Cho");
		cho.addReadBook("해리포터1");
		
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		cho.showStudentInfo();
		
	}

}
