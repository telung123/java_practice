package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		/* 추상클래스는 new 생성자 불가.
			Computer computer = new Computer();
		*/
		
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		System.out.println();
		Computer myNote = new MyNotebook();
		myNote.typing();
		myNote.display();
	}

}
