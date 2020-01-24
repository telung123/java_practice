package abstractex;

// 추상 클래스 = abstract class
public abstract class Computer {
	
	// 추상 Method 
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원 On");
	}
	
	public void turnOff() {
		System.out.println("전원 Off");
	}
}
