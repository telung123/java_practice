package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 묵시적 형 변환
		
		byte bNum = 10; //1byte
		int iNum = bNum; //4byte
		// 묵시적 형변환. 1byte가 4byte로 변환되기 때문에 문제가 없음.
		
		System.out.println(bNum); //10
		System.out.println(iNum); //10
		
		int iNum2 = 20; //4byte
		float fNum = iNum2; //4byte. 하지만 더 정밀함.
		// 역시 정수가 실수로 변환되는 과정에서는 문제가 없음.
		
		System.out.println(fNum); //20.0
		
		double dNum;
		dNum = fNum + iNum; // float + int 는 float 로 변환됨. 실수+실수 연산 처리
		
		
		System.out.println(dNum); // 30.0

	}

}
