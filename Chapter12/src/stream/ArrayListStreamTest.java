package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Jack");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream(); // stream Method 로 생성
		stream.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		// stream 은 사용할떄마다 생성해주어야 함. 
		// String 은 comparable 이 생성되어있기 때문에 sorted 동작함. 타 객체의 경우 comparable 작성해주어야 함
		sList.stream().sorted().forEach(s -> System.out.println(s));
		
		
		System.out.println();		
		sList.stream().map(s -> s.length()).forEach(n-> System.out.println(n));
		
	}

}
