package array;

public class arrayTest {

	public static void main(String[] args) {
		
		// int[] arr = new int[10]; --> 원소갯수 지정. 값 대입 없이 선언만 함
		/* int[] arr; arr = {1,2,3} 불가.*/
		//int[] arr = new int[] {1,2,3}; // 선언과 동시에 원소 초기화. 원소의 갯수는 작성하지 않는다.
		
		int[] arr = new int[10];
		
		for (int i = 0, len = arr.length, num = 1; i < len; i++, num++) {
			System.out.println(arr[i] += num);
		}
		
		// double array 곱셈. = 원소 갯수가 초기화 갯수와 동일하기 때문에 문제 없음
		double[] arrDbl = new double[3];
		arrDbl[0] = 1.1;
		arrDbl[1] = 2.1;
		arrDbl[2] = 3.1;
		
		int total = 1;
		for (int i = 0, len = arrDbl.length; i < len; i++) {
			System.out.println("double 원소 : "+ arrDbl[i]);
			total *= arrDbl[i];
		}
		System.out.println("\ndouble 원소 곱한 값 : "+ total);
		
		
		/* 아래의 double 곱셈 루프는 문제가 생긴다.
		 * 초기화에서 Array 의 length 를 5로 설정했으나,
		 * 이후 라인에서 사용자가 초기화한 원소의 갯수는 3개. 나머지 2개의 원소는 0.0 으로 초기화 되기 때문에,
		 * 값이 0으로 출력되기 때문이다.
		 * */
		double[] arrDbl2 = new double[5]; 
		arrDbl2[0] = 1.1;
		arrDbl2[1] = 2.1;
		arrDbl2[2] = 3.1; // 원소 3개만 초기화, 나머지 두개의 원소는 0.0 으로 초기화 된다.
		
		double total2 = 1;
		for (int i = 0; i < arrDbl2.length; i++) {
			total2 *= arrDbl2[i];
		} 
		System.out.println("\ndouble2 원소 곱한 값 : "+ total2); // 0 출력.
		
		
		/**
		 * 위와같은 문제는 아래처럼 임의의 변수 count 를 둠으로써, 
		 * length 만큼 돌지 않고 원소를 초기화 한 만큼만 loop 를 돌게 해주면 해결 할 수 있다.
		 */
		double[] arrDbl3 = new double[5];
		int count = 0; // 초기화 된 원소의 갯수를 담을 임의의 수
		double total3 = 1;
		
		arrDbl3[0] = 1.1; count++;
		arrDbl3[1] = 2.1; count++;
		arrDbl3[2] = 3.1; count++;
		
		for (int i = 0; i < count; i++) {
			total3 *= arrDbl3[i];
		}
		
		System.out.println("\ndouble3 원소 곱한 값 : "+ total3);
		
	}

}
