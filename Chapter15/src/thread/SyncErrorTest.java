package thread;

class Bank{
	private int money = 10000;
	
	public void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(2000); // Thread - 3sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
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
class Park extends Thread {
	public void run() {
		System.out.println("park start save");
		SyncErrorTest.mybank.saveMoney(3000);
		System.out.println("save money : " + SyncErrorTest.mybank.getMoney());
	}
}

// Thread 상속받은 class2 생성
class ParkWife extends Thread {
	public void run() {
		System.out.println("parkWife start minus");
		SyncErrorTest.mybank.minusMoney(1000);
		System.out.println("minus money : " + SyncErrorTest.mybank.getMoney());
	}
}

public class SyncErrorTest {

	public static Bank mybank = new Bank(); // 은행 생성 - static - 크리티컬 섹션. Share resources 
	
	public static void main(String[] args) throws InterruptedException {
		Park park = new Park();
		park.start();
		
		Thread.sleep(200);
		
		ParkWife parkWife = new ParkWife();
		parkWife.start();
		
		/* 동기화 오류 - 아래처럼 결과 나옴
		 *  park start save
			park start minus
			minus money : 9000
			save money : 13000
		 * */
		
	}

}
