package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5]; // 이런다고 Book 객체 5개가 생기진 않음. 단순히 배열이 만들어 진 것임.
		
		for (int i= 0; i<book.length; i++) {
			System.out.println(book[i]); // 전체 null 출력.
			
			book[i] = new Book("가나다"+i , "김가나다"+i);
			book[i].showBookInfo(); // 생성 후에는 참조 메모리 주소가 출력 됨
		}
		
		
	}
}
