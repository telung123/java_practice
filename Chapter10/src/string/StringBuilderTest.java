package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 문자열 가공!!
		// 메모리를 새로 생성하지 않고 더 효율적인 프로그래밍을 하려면,
		// StringBuffer 사용 - 멀티쓰레드 프로그래밍.
		// StringBuilder - 단일 쓰레드 프로그래밍.
		
		
		String java = new String("java");
		System.out.println("java : " + System.identityHashCode(java));
		String android = new String(" android");
		
		StringBuilder buffer = new StringBuilder(java); // java string 을 기반으로 빌더 생성
		
		System.out.println(System.identityHashCode(buffer));
		
		
		buffer.append(android); // 그냥 문자열 리터럴 넣어도 됨
		buffer.append(java); // 그냥 문자열 리터럴 넣어도 됨
		System.out.println(buffer); 
		
		// 이후 toString 작업
		java = buffer.toString();
		System.out.println("java : " + System.identityHashCode(java));
		System.out.println(System.identityHashCode(buffer)); // 동일한 hashMemory
		
		

	}

}
