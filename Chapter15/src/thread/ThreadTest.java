package thread;

class MyThread extends Thread {
	public void run() { // Thread 사용시 만들어야 하는 method
		int i;
		
		for ( i=0; i <= 30; i++ ) {
			System.out.print(i + "\t"); // Tab
			
			try {
				sleep(100); // 1000 분의 1초 단위. 찍을때마다 100ms 씩 재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
	}
}

class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		Thread t = Thread.currentThread(); // 현재 Thread 가져오기
		System.out.println(t);
		
		th1.start(); // Thread 호출
		th2.start(); // Thread 호출
		System.out.println("end");
		
		// 출력 - 0 0 1 1 ... 번갈아가면서 숫자 찍음(찍는 순서는 랜덤. 보장되지 않음)
		
		// 이 프로그램에서는 Main, th1, th2  3개의 쓰레드가 돌아감
		
	}
}
