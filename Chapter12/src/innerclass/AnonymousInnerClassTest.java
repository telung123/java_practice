package innerclass;

import java.util.ArrayList;

class OuterAnnoymous {	
	final int outNum = 100;
	final static int sNum = 200;
	
		
	public ArrayList<String> getArray(final ArrayList<String> arr) {
		
		return new ArrayList<String>() {
			public String toString() {
				String ch = "ARG ::";
				for (String arg : arr) {
					ch += arg;
				}
				return ch;				
			}
		};
	}
	
	public Runnable getRunnable(final int i) {
		final int num = 100;	
		
		// 익명 inner class. 생성자의 이름을 굳이 둘 필요가 없음 
		return new Runnable() { // Runnable - 쓰레드와 관련
			@Override
			public void run() {
				System.out.println("num:: "+num); // 참조는 가능함
				System.out.println("outNum : " + outNum); // 외부 클래스 변수 접근 허용
				System.out.println("static : " + Outer.sNum); // 정적 변수 접근 허용
				
			}
		};
		
	}
	
	// 익명 inner 클래스 - 바로 생성하여 대입
	// 단 한번만 사용할 추상클래스, interface 등을 아래처럼 생성하여 작성한다
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		OuterAnnoymous outer = new OuterAnnoymous();
		outer.runner.run(); // 익명 inner 클래스 method 호출 
		Runnable runable = outer.getRunnable(100);
		
		runable.run();
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		
		ArrayList<String> arr = outer.getArray(array);
		System.out.println(arr.toString());
		
	}

}
