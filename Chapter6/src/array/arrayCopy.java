package array;

public class arrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {10,20,30,40,50};
		int[] arr2 = new int[] {1,2,3,4,5};

		/* System.arraycopy(src, srcPos, dest, destPos, length);
		 * @ src : 복사 대상 배열 ,  srcPos : 복사 대상 배열의 원소 몇번부터  
		 * @ dest : copy 결과물 배열 , destPos : copy 결과물이 될  배열의 몇번부터 
		 * @ length : src 의 srcPos 부터 몇개 까지 copy 할것인지.
		 * == 결과물배열의 원본내용이 훼손됨. (copy 내용으로 대체됨)
		 * = [1,10,20,30,5]
		 * */
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		for (int i = 0; i< arr2.length; i++) {
			System.out.println(arr2[i]);
			// 1, 10, 20, 30, 5 출력
		}
		System.out.println();
		
		for (int i = 0; i< arr1.length; i++) {
			System.out.println(arr1[i]); // copy 대상 배열은 훼손되지 않음
		}

	}

}
