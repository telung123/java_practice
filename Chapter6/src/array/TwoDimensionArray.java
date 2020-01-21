package array;

public class TwoDimensionArray { // 2차원 배열

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,2,3}, {4,5,6}};
		
		for (int i = 0, len = arr.length; i< len; i++) { // 2행
			for( int k=0, lenCol = arr[i].length; k < lenCol; k++ ) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
	}

}
