package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 문자열 가공!!
		// 메모리를 새로 생성하지 않고 더 효율적인 프로그래밍을 하려면 !! StringBuffer 사용 - 멀티쓰레드에서 동기화가 보장됨.
		// 단일 쓰레드 프로그래밍에서는 StringBuilder 를 사용하는것이 더 좋음.
		
		
		String java = new String("java");
		String android = new String(" android");
		
		StringBuilder buffer = new StringBuilder(java); // java string 을 기반으로 빌더 생성
		
		System.out.println(System.identityHashCode(buffer));
		
		
		buffer.append(android); // 그냥 문자열 리터럴 넣어도 됨
		
		// 이후 toString 작업
		java = buffer.toString();
		System.out.println(System.identityHashCode(buffer)); // 동일한 hashMemory
		
		
		
		

	}

}
