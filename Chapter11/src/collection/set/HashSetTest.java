package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	
	
	public static void main(String[] arg) {
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김수로");
		set.add("강감찬");
		set.add("이순신"); // 중복 허용하지 않음. 무시됨
		
		System.out.println(set.toString());
		
		Iterator<String> ir = set.iterator(); // 모든 Collection 에 사용 가능.
		
		while(ir.hasNext()) { // hasNext() - 다음 엘리먼트가 존재하는지
			String str = ir.next(); // next value
			System.out.println(str);
		}
		
	}
	

}
