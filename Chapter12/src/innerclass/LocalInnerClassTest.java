package innerclass;

class Outer {	
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(final int i) {
		final int num = 100;
		
		// Local inner class (Method 내부 Class)
		class MyRunnable implements Runnable { // Runnable - 쓰레드와 관련
			@Override
			public void run() {
				
				// Method의 Local 변수이기 때문에 내부 클래스에서의 접근은 유효하지 않다.
				// 상위 Method 의 멤버변수들은 런타임시 final 처리 됨.= 상수 (변경 불가.)
				// num += 10;
				// i = 200;
				
				System.out.println("num:: "+num); // 참조는 가능함
				
				System.out.println("outNum : " + outNum); // 외부 클래스 변수 접근 허용
				System.out.println("static : " + Outer.sNum); // 정적 변수 접근 허용
				
			}
		}
		
		return new MyRunnable();
	}
}


public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runable = outer.getRunnable(100);
		
		runable.run();
		
		
	}

}
