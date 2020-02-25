package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


// Reduce binaryOperator 작성
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else {
			return s2;
		}
	}
}


public class ReduceTest {

	public static void main(String[] args) {
		
		String[] str = {"Good morning","하이","반갑습니다"};
		
		System.out.println(
			Arrays.stream(str).reduce("", (s1,s2)-> {
				if(s1.getBytes().length >= s2.getBytes().length) {
					return s1;
				}
				else {
					return s2;
				}
			})
		);
		
		// 생성한 바이너리 객체를 reduce의 인자로 전달함. 비교문이 간단해짐
		System.out.print("Binary 객체 사용: ");
		System.out.println(Arrays.stream(str).reduce(new CompareString()).get());
		
		

	}

}
