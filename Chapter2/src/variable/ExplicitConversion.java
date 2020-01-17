package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 명시적 형 변환
		
		int i = 1000;
		byte bNum = (byte)i; // 4byte를 1byte 에 넣으려고 하면 안됨. 타입캐스팅 처리
		// 이럴 경우 데이터의 유실이 발생.
		
		System.out.println(bNum); // -24
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum; // double + float. 불가
		int iNum2 = (int)(dNum1+fNum);
		// (int)로 형변환
		System.out.println(iNum1); //1
		System.out.println(iNum2); //2
		
		// iNum1, iNum2 두개가 다른 이유는?
		// 먼저 int 로 각각 형변환 해 줄 경우, 소숫점 이하는 짤려버리기 때문에 1+0 = 1 이 됨
		// 연산 후  int로 형변환 할 경우 , 1.2 + 0.9 = 2.1 을 정수화 하면서 2가 됨

	}

}
