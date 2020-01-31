package interfaceex;

public interface Calc {
	
	//interface 의 모든 변수는 상수.
	double PI = 3.14; // Compile 단계에서 public static final 으로 컴파일 됨
	int ERROR = -999999999; // Error number - integer 범위 내에서 사용하지 않을것같은(?) 번호를 사용함
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	// 디폴트 method - 오버라이딩 가능함
	default void description(){
		System.out.println("정수 계산기를 구현합니다.");
		// myMethod(); // private method 사용
	}
	
	// static으로 생성 - 정적 메소드. 
	// Interface 상속받은 클래스 생성없이도 interface 타입으로 사용 가능
	static int total(int[] arr) {
		int total =0;
		
		for(int i : arr) {
			total+=(i+1);
		}
		// myStaticMethod(); - static method이기 때문에 마찬가지로 호출도 static 내부에서 해야 함.
		
		return total;		
	}
	
	// private method - general / static 두종류
	/* JAVA9 부터 제공.
	private void myMethod() {
		System.out.println("private - My method");
	}
	
	
	private static void myStaticMethod(){
		System.out.println("private - My Static method");
	}
	*/
	
}
