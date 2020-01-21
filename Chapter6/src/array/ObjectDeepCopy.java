package array;

public class ObjectDeepCopy {
	
	
public static void main(String[] args) { // 객체 배열 복사
		
		Book[] book = new Book[5];
		
		book[0] = new Book("제목1","김가나다");
		book[1] = new Book("제목2","김가나다");
		book[2] = new Book("제목3","김가나다");
		book[3] = new Book("제목4","김가나다");
		book[4] = new Book("제목5","김가나다");
		
		// Deep copy (Clone, 별도의 객체로 Copy)
		Book[] copyBook = new Book[5];
		for (int i = 0, len = book.length; i < len; i++ ) {
			copyBook[i] = new Book(); 
		}
		
		
		// 생성한 copy객체에 원천 배열 대입 (원소가 아닌 '값'을 대입하는것에 유의한다.)
		for(int i = 0, len = book.length; i < len; i++) {
			copyBook[i].setAuthor(book[i].getAuthor());
			copyBook[i].setTitle(book[i].getTitle());
		}
	
		
		
//		System.arraycopy(book, 0, copyBook, 0, 5);
		
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
		
		for (Book arg : book) {
			System.out.print("원천배열 : ");
			arg.showBookInfo();
		}
		
		System.out.println();
		
		// 원천배열과 복사배열은 각기 다른 주소값을 갖는 별개의 객체임. 
		// 따라서 원천배열의 값을 변경해도 복사 배열의 값은 변경되지 않음.
		for (Book arg : copyBook) {
			System.out.print("복사한 배열: ");
			arg.showBookInfo();
		}
	}

}

