package variable;

public class IntegerTest {

	public static void main(String[] args) {

		byte bs = 127; // byte 는 -128 ~ +127 까지 표현 가능
		
		//int iNum = 12345678900; // out of range 
		long lNum = 12345678900L;
		// java 내부에서 정수형 Data는 기본적으로 integer 타입에 대입한다 (4byte)		
		
		
		System.out.println(bs);
	}

}
