package sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException{
		
		int[] ascArr = {0,1,2,3,4};
		int[] descArr = {6,5,4,3,2,1};
		Sort sort = null;
		
		System.out.println("소트 방식을 선택하세요. Q/H");
		int ch = Character.toLowerCase(System.in.read());
		
		if ( ch == 'h') {
			sort = new HeapSort();
		}
		else if ( ch == 'q') {
			sort = new QuickSort();			
		} 
		else {
			System.out.println(Sort.ERROR);
			return;
		}
		
		sort.ascending(ascArr);
		sort.descending(descArr);
		sort.description();

	}

}
