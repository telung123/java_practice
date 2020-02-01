package sorttest;

public interface Sort {
	
	String ascending(int[] arr);
	String descending(int[] arr);

	default void description() {
		System.out.println("기본 설명 Method");
	}
}
