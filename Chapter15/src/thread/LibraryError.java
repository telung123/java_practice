package thread;

import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("태백산맥1");
		books.add("태백산맥2");
		books.add("태백산맥3");
	}
	
	public synchronized String lendBook() {
		Thread t = Thread.currentThread(); // 어떤 쓰레드가 빌려가는지
		String title = books.remove(0); // 첫번째 책 빌려주기
		
		System.out.println(t.getName() + " : " + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		
		System.out.println(t.getName() + " : " + title + " return");
	}
}

// 학생
class Student extends Thread {
	
	public void run() {
		try {
			String title = LibraryError.library.lendBook();
			sleep(2000);
			
			LibraryError.library.returnBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryError {
	
	public static FastLibrary library = new FastLibrary();

	public static void main(String[] args) {
		/* 위에서 학생이 빌리려는 Shared resource - 책은 3권인데,
		 * 아래처럼 Thread 객체 (학생) 은 여러개 일때 , 
		 * 리소스가 한정되어있기 때문에 아래 구문은 오류가 나게 됨.
		 */
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}
