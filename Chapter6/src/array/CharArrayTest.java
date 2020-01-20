package array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		// 방법1. 
		char[] charArr = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for (int i = 0, len = charArr.length; i < len; i++) {
			System.out.println(charArr[i]);
		}
		
		// 방법2. 문자열도 정수로 표현됨을 이용
		char[] charArr2 = new char[26];
		char ch = 'A';
		
		for ( int i = 0, len = charArr2.length; i < len; i++ ) {
			charArr2[i] = ch++;
			System.out.println(charArr2[i] + ", " + (int)charArr[i]);
		}
	}

}
