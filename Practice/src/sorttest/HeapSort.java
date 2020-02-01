package sorttest;

public class HeapSort implements Sort {

	@Override
	public String ascending(int[] arr) {
		return "HeapSort ASC : "+ arr.toString();
	}

	@Override
	public String descending(int[] arr) {
		return "HeapSort DESC : "+ arr.toString();
	}

	@Override
	public void description() {
		System.out.println("HeapSort : 디폴트 메서드 Overriding");
	}

	public void heapSortMethod() {
		System.out.println("Heap Sort 전용 메소드");
	}
}
