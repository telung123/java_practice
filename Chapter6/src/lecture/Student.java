package lecture;

import java.util.ArrayList;

public class Student {
	
	int id;
	String studentName;
	
	// 과목
	ArrayList<Subject> subjectList;
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	// 학생의 과목 생성
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name,score);	// String 외 별도의 객체 타입은 객체생성 후 ArrayList 에 add 해주어야 한다.
		subjectList.add(subject); // 생성한 Subject 객체를 add
	}
	
	
	// 학생 정보 출력
	public void showStudentInfo() { 
		int total = 0;
		
		for (Subject subject : subjectList) { // 과목 총점 계산
			total += subject.getScore();
			System.out.println(subject.getName() + " 과목 점수 : " + subject.getScore());
		}
		
		System.out.println(studentName + "학생 총점 : "+ total);
	}
	
}
