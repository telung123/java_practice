package abstractex;

public class MyNotebook extends Notebook {
	
	//상위 Notebook abstract 클래스에서 'typing' 은 구현이 되어있기 때문에,
	// MyNotebook 클래스에서는 'display' 메서드만 구현하면 일반클래스로 선언 할 수 있다.
	
	@Override
	public void display() {
		System.out.println("MyNotebook display");
	}
}
