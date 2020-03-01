package thread;

/* Synchronized Method 를 포함하고 있기 떄문에,
 * 그 Method 의 객체인 Bank2 객체에 lock 이 걸림.
 * 해당 sync method 가 수행될 동안은 다른 Thread 가 크리티컬 섹션에 접근할 수 없다.
 * 먼저 시작한 park2 의 Thread 가 종료되기 전까지 parkWife2 Thread 는 수행되지 않는다.
 * */
class Bank2 {
	private int money = 10000;
	
	/* synchronized method */
	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(2000); // Thread - 3sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	/* synchronized method */
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		try {
			Thread.sleep(500); // Thread - 500ms
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		setMoney( m - minus);
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}


// Thread 상속받은 class 생성
class Park2 extends Thread {
	public void run() {
		System.out.println("park start save");
		SyncMethodTest.mybank.saveMoney(3000);
		System.out.println("save money : " + SyncMethodTest.mybank.getMoney());
	}
}

// Thread 상속받은 class2 생성
class ParkWife2 extends Thread {
	public void run() {
		System.out.println("parkWife start minus");
		SyncMethodTest.mybank.minusMoney(1000);
		System.out.println("minus money : " + SyncMethodTest.mybank.getMoney());
	}
}

public class SyncMethodTest {

	public static Bank2 mybank = new Bank2(); // 은행 생성 - static - 크리티컬 섹션. Share resources 
	
	public static void main(String[] args) throws InterruptedException {
		Park2 park = new Park2();
		park.start();
		
		Thread.sleep(200);
		
		ParkWife2 parkWife = new ParkWife2();
		parkWife.start();
		
		/* 동기화 처리 - 아래처럼 결과 나옴
		 *  park start save
			park wife start minus
			save money : 13000
			minus money : 12000

		 * */
		
	}

}
