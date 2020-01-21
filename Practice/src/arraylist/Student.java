package arraylist;

import java.util.ArrayList;

public class Student {
	
	private static int serialNum = 0; // 학생 ID로 입력할 시퀀스
	private int studentId;
	private String studentName;	
	private ArrayList<Book> bookList; // 읽은 책 List
	
	public Student(String studentName) {
		this.studentName = studentName;
		studentId = Student.serialNum;
		
		Student.serialNum++; // 학생을 생성 할 때마다 시퀀스 증가
		
		bookList = new ArrayList<Book>(); // 학생 생성시 신규 Booklist 생성
	}
	
	
	// 읽은 책 추가
	public void addReadBook(String name) {
		Book book = new Book(name);		
		bookList.add(book);
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public void showStudentInfo() {
		String bookNames = "";
		for ( Book book : bookList )  {
			bookNames += (" " + book.getName());
		}
		System.out.println(studentName + "학생이 읽은 책은" + bookNames + "입니다.");
	}
}
