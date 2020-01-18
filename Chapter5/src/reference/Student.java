package reference;

public class Student {
	String studentName;
	int studentId;
	Subject subject;
	
	
	public Student(String name, int id) {
		studentName = name;
		studentId = id;
		
		subject = new Subject();		
	}
	
	public void setStudentScore(String key, int score) {
		switch(key) {
			case "korea": subject.koreaScore = score;break; /* 국어 */ 
			case "math": subject.mathScore = score;break; /* 수학 */ 
		}
	}
	
	public void getStudentInfo() {
		System.out.println(studentName + " / " + studentId);
		
		int koreaScore = subject.getSubjectScore("korea");
		int mathScore = subject.getSubjectScore("math");
		
		System.out.println("국어 : "+ koreaScore + " / 수학:" + mathScore);
	}

}
