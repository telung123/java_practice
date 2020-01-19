package staticex;

public class StudentStatic {

	private static int serialNum = 1000;
	public String studentName;
	public String address;
	
	private int studentId;
	
	public StudentStatic(String name) {
		studentName = name;
		serialNum++;
		studentId = serialNum;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public static int getSerialNum() { // static 변수는 static 으로 return
		int i = 0; // 지역변수 . 사용해도 됨
		
		// 단, 인스턴스 변수는 static method 안에서 사용할 수 없음.
		// 왜냐!! 인스턴스 생성과 무관하게 런타임시 생성되는 static method 이기 때문임.
		// studentName = "kim"; 
		
		return serialNum;
		
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName+ "," + address);
	}
	

}
