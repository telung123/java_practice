package classpart;

// java 파일 하나에는 보통 class가 하나 들어가는데, 여러개가 들어갈 수도 있다.
// 단, public[Access modifier. 접근 제어자] class 는 하나여야 함. (자바 파일명과 동일해야 함 )
public class Student {
	
	// 멤버변수 (OR property)
	public int studentId;			// 학생 ID
	public String studentName;		// 이름 
	public String address;			// 주소
	
	// Method 구현
	public void getStudentInfo() {	// 반환하는게 없는 경우 void
		System.out.println("이름 : " + studentName + ", 학번: "+ studentId + ", 주소: "+address);
	}
	
	public String getStudentName() { // 학생 이름 반환
		return studentName;
	}
}
