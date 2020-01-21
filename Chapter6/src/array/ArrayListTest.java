package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList<type> variable = new ArrayList<type>();
		ArrayList<String> list = new ArrayList<String>(); 
		
		// ArrayList 에 Item 추가
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// ArrayList length 는 ArrayList.size(); 로 꺼내올 수 있다
		// 배열의 length 와의 차이는 , 배열은 총 길이를 반환하는 반면 (fill)
		// ArrayList 는 크기가 어떻든 실제 채워진 원소의 갯수를 반환함 (10개의 size여도 실제 원소가3개면 3을 return)
		for(int i = 0, len = list.size(); i < len; i++) {
			// list 의 Item 가져오기 .get(index)
			String str = list.get(i);
			System.out.println(str);			
		}
		
		System.out.println();
		
		// Inhanced for loop
		for (String arg : list) {
			System.out.println(arg);
		}
		
	}

}

