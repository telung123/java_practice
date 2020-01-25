package sort;

public class HeapSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		String arrTxt = "";
		for (int i = 0, len = arr.length; i < len; i++) {
			arrTxt += arr[i];
		}
		System.out.println(arrTxt);
		System.out.println("HeapSort Ascending");
	}

	@Override
	public void descending(int[] arr) {
		String arrTxt = "";
		for (int i = 0, len = arr.length; i < len; i++) {
			arrTxt += arr[i];
		}
		System.out.println(arrTxt);
		System.out.println("HeapSort Descending");
	}
	
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort 입니다.");
	}
}
