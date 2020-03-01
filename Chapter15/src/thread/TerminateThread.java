package thread;

import java.io.IOException;

public class TerminateThread extends Thread {

	private boolean flag = false; // Thread stop을 위한 Flag
	int i;
	
	
	public TerminateThread(String name) { // Thread에 name 주기
		super(name);
		
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " end");
	}
	
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThread th1 = new TerminateThread("thread1");
		TerminateThread th2 = new TerminateThread("thread2");
		
		th1.start();
		th2.start();
		
		int in;
		while (true) {
			in = System.in.read();
			if ( in == 'A' ) {
				th1.setFlag(true); // 특정 시점에 flag 처리해서 멈추게 하기
			} 
			else if (in == 'B') {
				th2.setFlag(true); // 특정 시점에 flag 처리해서 멈추게 하기
			} 
			else if (in == 'M') { // 둘다멈추기
				th1.setFlag(true); 
				th2.setFlag(true);
				break; // break 없으면 Main 에서 System.out.println 안찍힘
			}
			else {
				System.out.println("Try again");
			}
		}
		
		System.out.println("Main end");
		
		/*
		 * 결과 값에서 Try again이 2번 찍히는것은 엔터키때문에 발생하는 뉴라인 + 캐리지 리턴이 발생하기 때문임 ( \n, \r)*/
	}

}
