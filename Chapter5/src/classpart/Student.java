package classpart;

// java 파일 하나에는 보통 class가 하나 들어가는데, 여러개가 들어갈 수도 있다.
// 단, public[Access modifier. 접근 제어자] class 는 하나여야 함. (자바 파일명과 동일해야 함 )
public class Student {
	
	// 멤버변수 (OR property)
	int studentId;			// 학생 ID
	String studentName;		// 이름 
	String address;			// 주소
	
	public Student() {} 	// --> 디폴트 생성자. 다른 생성자가 없을 경우 컴파일러가 자동으로 생성해 줌
	
	public Student(int id, String name) { // 생성자 2
		studentId = id;
		studentName = name;
	}
	
	// Method 구현
	public void getStudentInfo() {	// 반환하는게 없는 경우 void
		System.out.println("이름 : " + studentName + ", 학번: "+ studentId + ", 주소: "+address);
	}
	
	public String getStudentName() { // 학생 이름 반환
		return studentName;
	}
}
