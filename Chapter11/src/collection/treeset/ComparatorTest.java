package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;


// Comparator 객체. 또 다른 비교를 위해 사용 가능
class MyCompare implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// 내림차순 정렬
		return o1.compareTo(o2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {		
		
		// Comparator 로 비교하게 처리
		// (new MyCompare()) 생성자로 새로 작성한 Comparator 의 방식으로 정렬을 구성하게 됨.
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); 
		// 자동으로 오름차순 됨 (String 의 경우 Comparable 구현 되어있어서 가능)
		treeSet.add("홍길동");
		treeSet.add("김가빈");
		treeSet.add("심도은");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}
