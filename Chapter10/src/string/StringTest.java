package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 인스턴스를 생성했기 때문에 heap area 영역에 생성. address가 틀림. false
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		// 리터럴이 모여있는 상수 풀에서 비교하기 때문에 address 가 동일함. true 가 떨어짐
		System.out.println(str3 == str4);				
		
		// String 은 immutable. 한번 생성된 문자열은 변경할 수 없다.
		// "+", concat() 메서드를 이용해서 String 을 연결하는 경우 문자열은 '새로' 생성된다. (새로운 Memory 생성)
		String strTest = "abc";
		String strTest2 = "abc";
		System.out.println("원천 주소 : "+ System.identityHashCode(strTest));
		System.out.println(System.identityHashCode(strTest) + " " +System.identityHashCode(strTest2)); // 동일
		System.out.println(System.identityHashCode(strTest + "def")); // 다름
		System.out.println(System.identityHashCode(strTest.concat("ddd"))); // 다름2
	}

}
