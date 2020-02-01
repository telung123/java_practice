package sorttest;

public class QuickSort implements Sort {

	@Override
	public String ascending(int[] arr) {
		return "QuickSort ASC : " + arr.toString();
	}

	@Override
	public String descending(int[] arr) {
		return "QuickSort DESC : " + arr.toString();
	}

}
