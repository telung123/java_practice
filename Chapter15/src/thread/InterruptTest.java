package thread;

public class InterruptTest extends Thread {

	public void run() {
		int i;
		for (i = 0; i < 100; i ++) {
			System.out.println(i);
		}
		try {
			sleep(4000);
		} catch (InterruptedException e) {
			
			System.out.println(e);
			System.out.println("인터럽트! 깨어남!");
		}
		
	}
	public static void main(String[] args) {

		InterruptTest test = new InterruptTest();
		test.start();
		test.interrupt(); // 5초를 기다리는게 아닌 인터럽트 익셉션으로 넘어간다
		
		System.out.println("end");
	}

}
