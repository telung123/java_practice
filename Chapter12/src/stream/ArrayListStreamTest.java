package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("ASD");
		list.add("asdasdasd");
		
		// Collection stream 생성
		Stream<String> stream = list.stream();
		stream.forEach(e->System.out.println(e));
		
		System.out.println();
		
		list.stream().sorted().forEach(e->System.out.println("정렬 : " + e));
		
		// 원소의 길이 반환
		list.stream().map(s->s.length()).forEach(n->System.out.println(n));
	}

}
