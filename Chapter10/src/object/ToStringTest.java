package object;

class Book implements Cloneable {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() { // toString override
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("해리포터", "조앤K롤링");
		System.out.println(book);
		
		String str = new String("해리포터");
		System.out.println(str); //str.toString() 이 축약되어 있음.
		
		int[] arr = new int[] {1,2,3};
		System.out.println(arr.toString());
		
		
		Book book2 = (Book)book.clone(); // .clone() 의 Return 원형은 Object. 다운캐스팅처리
		System.out.println(book2); // 그냥 하면 Error. Cloneable 을 명시해주어야 함.(implements)
	}

}
