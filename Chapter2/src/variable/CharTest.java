package variable;

public class CharTest {

	public static void main(String[] args) {				 
		char ch = 'A';
	
		System.out.println(ch);
		System.out.println((int)ch); // 타입 캐스팅. int 로 표현
		
		int ich = 66;
		System.out.println(ich);
		System.out.println((char)ich);
		
//		char ch2 = -22; : char 데이터 형에 음수값은 대입할 수 없음
		
		char hangul ='\uAC00';
		System.out.println(hangul);
	}

}
