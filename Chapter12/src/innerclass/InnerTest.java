package innerclass;

class OutClass {
	private int num = 10;
	private static int snum = 20;
	private InClass inClass;
	
	public OutClass() {		
		// innerClass - 주로 외부클래스의 생성자에서 생성
		inClass = new InClass();
	}
	
	class InClass {
		int iNum = 100;
		// 생성해야만 사용이 가능한 static 변수는 사용 불가. Static inner class인 경우 사용가능.
		// 인스턴스 innerClass 의 경우 사용할 수 없음
		// 외부 클래스의 private 사용 가능
		
		void inTest() {
			System.out.println(num);
			System.out.println(snum); // 외부 클래스의 static 사용가능(당연..)
		}
	}
	
	
	public void usingInner() { // 내부 클래스 사용을 위한 Method
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInum = 200;
		
		void inTest() { // static 내부 일반 Method
			System.out.println("static: " +  sInum);
		}		
		
		static void sTest() { // static 내부 static Method
			System.out.println(snum); // 같은 static 접근 가능			
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		// 외부클래스.내부클래스로 접근하여 직접 생성 가능
		// 이상한 구문이지만 (문법적으론)이렇게도 생성이 가능함.
		// 만약! innerClass가 public 이 아닌 private 일 경우 아래처럼 생성 불가.
		OutClass.InClass myInclass = outClass.new InClass();
		myInclass.inTest();
		
		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		// Static 메서드는 생성없이 바로 호출도 됨 (static)
		OutClass.InStaticClass.sTest();

	}

}
