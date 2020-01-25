package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		// 기능적인 면을 우선하기 때문에 Interface type으로 선언
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("해리포터1");
		bookQueue.enQueue("해리포터2");
		bookQueue.enQueue("해리포터3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());	

	}

}
