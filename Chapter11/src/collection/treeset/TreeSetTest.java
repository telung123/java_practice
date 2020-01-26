package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		// 자동으로 오름차순 됨 (String 의 경우 Comparable 구현 되어있어서 가능)
		treeSet.add("홍길동");
		treeSet.add("김가빈");
		treeSet.add("심도은");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		
		

	}

}
