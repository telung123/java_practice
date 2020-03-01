package thread;

class MyThreadRunnable implements Runnable {
	// extends로 다른 클래스를 상속 했을 경우 implements - Runnable 로 멀티쓰레드 대체 
	@Override
	public void run() {
		int i;
		
		for ( i=0; i <= 30; i++ ) {
			System.out.print(i + "\t"); // Tab
			
			try {
				Thread.sleep(100); // 1000 분의 1초 단위. 찍을때마다 100ms 씩 재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

class ThreadRunnableTest {

	public static void main(String[] args) {
		
		// Runnable 생성 및 사용
		System.out.println("start");
		MyThreadRunnable run1 = new MyThreadRunnable();
		Thread th1 = new Thread(run1); // Runnable 객체를 Thread 인스턴스로 넣어줌
		th1.start(); 
		
		MyThreadRunnable run2 = new MyThreadRunnable();
		Thread th2 = new Thread(run2); 
		th2.start(); 
		
		System.out.println("end");
	}
}
