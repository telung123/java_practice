package sorttest;

import java.io.IOException;
import java.util.ArrayList;

public class SortTest {
	

	public static void main(String[] args) throws IOException {
		int[] ascArr = {0,1,2,3,4};
		int[] descArr = {4,3,2,1,0};
//		ArrayList<String> intArr = new ArrayList<String>();
//		intArr.add("3");
//		intArr.add("2");
//		intArr.add("1");
//		System.out.println(intArr.toString());
		
		
		System.out.println("Q/H 입력하세요");
		int ch = Character.toLowerCase(System.in.read());
		Sort sort = null;
		
		if ( ch == 'q' ) {
			sort = new QuickSort();
		} else  if ( ch == 'h' ) {
			sort = new HeapSort();
		} else {
			System.out.println("잘못된 입력값입니다.");
			return;
		}
		
		System.out.println(sort.ascending(ascArr));
		System.out.println(sort.descending(descArr));
		sort.description();
			
		// 다운 캐스팅
		if ( sort instanceof HeapSort ) {
			((HeapSort)sort).heapSortMethod();
		}

	}

}
