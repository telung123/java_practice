package abstractex;

// 2개의 추상메서드(display, typing) 중 하나만 구현했기 때문에 Notebook 클래스는 abstract 로 선언되었다.
public abstract class Notebook extends Computer {
	@Override
	public void typing() {
		System.out.println("Notebook typing");
	}
}
