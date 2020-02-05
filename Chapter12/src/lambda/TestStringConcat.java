package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// 일반적인 Interface 방식
		StringConImpl impl = new StringConImpl();
		impl.makeString("123", "ddd");
		
		// 람다식
		StringConcat lambda = (s1,s2)-> System.out.println(s1+s2);
		lambda.makeString("Hello", " Lambda!");

		
		// 내부적으로는 익명 내부클래스를 구현한다
		StringConcat lambda2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("Lambda2!! -> "+ s1+s2);
			}
		};
		
		lambda2.makeString("hi", " ~~~ ");
	}

}
