package thread;

import java.util.ArrayList;

class FastLibrary2{
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary2() {
		books.add("태백산맥1");
		books.add("태백산맥2");
		books.add("태백산맥3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread(); // 어떤 쓰레드가 빌려가는지
		/* 리소스가 없으면 기다리게 함
		 * 아래 조건문에서 if ( books.size ==0 ) .. 으로 처리할 경우 리소스 해제가 하나가 되었을때
		 * notifyAll 을 해주는데, 모든 Thread 가 lendBook이 가능하게 되면서 다시 에러가 남.
		 * 해서 while 로 변경해주어야 함 (리소스가 없으면 다시 잠들게 처리)
		 * */
		while ( books.size() == 0 ) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		String title = books.remove(0); // 첫번째 책 빌려주기
		
		System.out.println(t.getName() + " : " + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		
		// returnBook - 책을 돌려주는 시점에 notifyAll 처리
		// 공평하지 않기 때문에 (영영 깨어나지 않는 Thread 가 생길수도 있기 때문에)
		// notifyAll() 처리를 해주는것이 바람직 함
		notifyAll();
		
		System.out.println(t.getName() + " : " + title + " return");
	}
}

// 학생
class Student2 extends Thread {
	
	public void run() {
		try {
			String title = LibraryWait.library.lendBook();
			
			// 리소스가 없으면 return 
			if ( title == null ) {
				return;
			}
			sleep(2000);
			
			LibraryWait.library.returnBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryWait {
	
	public static FastLibrary2 library = new FastLibrary2();

	public static void main(String[] args) {
		/* 위에서 학생이 빌리려는 Shared resource - 책은 3권인데,
		 * 아래처럼 Thread 객체 (학생) 은 여러개 일때 , 
		 * 리소스가 한정되어있기 때문에 아래 구문은 오류가 나게 됨.
		 */
		Student2 std1 = new Student2();
		Student2 std2 = new Student2();
		Student2 std3 = new Student2();
		Student2 std4 = new Student2();
		Student2 std5 = new Student2();
		Student2 std6 = new Student2();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}
