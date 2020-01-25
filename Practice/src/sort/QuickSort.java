package sort;

import java.lang.reflect.Array;

public class QuickSort implements Sort {
	

	@Override
	public void ascending(int[] arr) {
		String arrTxt = "";
		for (int i = 0, len = arr.length; i < len; i++) {
			arrTxt += arr[i];
		}
		System.out.println(arrTxt);
		System.out.println("QuickSort Ascending");
	}

	@Override
	public void descending(int[] arr) {
		String arrTxt = "";
		for (int i = 0, len = arr.length; i < len; i++) {
			arrTxt += arr[i];
		}
		System.out.println(arrTxt);
		System.out.println("QuickSort Descending");
	}
	
	@Override
	public void description() {
		Sort.super.description(); // super method 참조
		System.out.println("QuickSort 입니다.");
	}
	
	

}
