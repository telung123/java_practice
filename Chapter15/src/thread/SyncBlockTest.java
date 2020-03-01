package thread;

/* Synchronized Block 
 * 
 * */
class Bank3 {
	private int money = 10000;
	
	public void saveMoney(int save) {
		synchronized (this) { // Synchronized Block. 어느 객체에 Lock 을 걸건지 명시 - this(Bank)
			int m = this.getMoney();
			
			try {
				Thread.sleep(2000); // Thread - 3sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
	}
	
	public void minusMoney(int minus) {
		synchronized (this) {
			int m = this.getMoney();
			try {
				Thread.sleep(500); // Thread - 500ms
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			setMoney( m - minus);
		}
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}


// Thread 상속받은 class 생성
class Park3 extends Thread {
	public void run() {
		System.out.println("park start save");
		SyncBlockTest.mybank.saveMoney(3000);
		System.out.println("save money : " + SyncBlockTest.mybank.getMoney());
	}
}

// Thread 상속받은 class2 생성
class PrakWife3 extends Thread {
	public void run() {
		/* 아래 주석처리한것처럼 Synchronized Block 을 처리할 수도 있음.
		 * 위에서 Shared 리소스에 직접 처리한것과는 달리, 아래 System.out.println 로그조차 찍히지 않는다 (기다림) 수행의 결과에 차이가 생김 */ 
		//synchronized (SyncBlockTest.mybank) {			
			System.out.println("parkWife start minus");
			SyncBlockTest.mybank.minusMoney(1000);
			System.out.println("minus money : " + SyncBlockTest.mybank.getMoney());
		//}
	}
}

public class SyncBlockTest {

	public static Bank3 mybank = new Bank3(); // 은행 생성 - static - 크리티컬 섹션. Share resources 
	
	public static void main(String[] args) throws InterruptedException {
		Park3 park = new Park3();
		park.start();
		
		Thread.sleep(200);
		
		PrakWife3 parkWife = new PrakWife3();
		parkWife.start();
		
		/* 동기화 처리 - 아래처럼 결과 나옴
		 *  park start save
			park wife start minus
			save money : 13000
			minus money : 12000

		 * */
		
	}

}
