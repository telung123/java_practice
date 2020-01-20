package array;

public class ObjectCopy {

	public static void main(String[] args) { // 객체 배열 복사
		
		Book[] book = new Book[5];
		
		book[0] = new Book("제목1","김가나다");
		book[1] = new Book("제목2","김가나다");
		book[2] = new Book("제목3","김가나다");
		book[3] = new Book("제목4","김가나다");
		book[4] = new Book("제목5","김가나다");
		
		Book[] copyBook = new Book[5];
		
		System.arraycopy(book, 0, copyBook, 0, 5);
		
		// 향상된 포문
		/* Book copyArg : 어떤 객체로 element 를 추출할 것인지 선언. (타입 + 변수)
		 * : copyBook - for 문을 돌 객체. 전체 length 만큼 자동으로 루프 된다.
		 * 한번 반복 될때마다 copyArg 로 copyBook 의 원소가 추출됨 (element)
		 * */
		for( Book copyArg : copyBook ) {
			copyArg.showBookInfo();
		}
		
		book[0].setTitle("바뀐제목1"); // 복사한 원천배열 원소 변경.
		book[0].setAuthor("심가나다");
		
		for (Book copyArg : book) {
			System.out.print("원천배열 : ");
			copyArg.showBookInfo();
		}
		System.out.println();
		for (Book copyArg : copyBook) {
			System.out.print("복사한 배열: ");
			copyArg.showBookInfo();
		}
		
		// 원천배열의 원소를 변경하였으나, 복사한 배열도 함께 원소의 변경이 일어났음. Shallow copy (얕은 복사)
		// 참조 주소만 복사됨
		
		
		
	}
	

}

