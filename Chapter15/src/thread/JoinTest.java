package thread;

public class JoinTest extends Thread {
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		int i;
		for ( i = start; i <=end; i++ ) {
			total += i;
		}
	}
	
	public int getTotal() {
		return total;
	}

	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join(); // join 을 건 주체 : Main. jt1, jt2 의 쓰레드가 끝날때까지 System.out.prinln 이후의 구문은 기다리게 됨. 오차 없어짐!
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("jt1 total = " + jt1.total + " / jt2 total= " + jt2.total); 
		int total = jt1.total + jt2.total;
		System.out.println("TOTAL: " + total);
	}

}
