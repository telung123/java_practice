package practice;

import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		// 별찍기로 다이아몬드 구현. 입력받아서 출력하시오
		//		*    1
		//	   ***   3
		//	  *****  5
		//	 ******* 7
		//	  *****  5
		//	   ***   3
		//	    *    1
		
		
		Scanner scan = new Scanner(System.in);
		int starCount = scan.nextInt();
		
		if (starCount%2 == 0) { // 짝수입력 오류
			System.out.println("홀수를 입력하세요.");
			return;
		}
		
		int spaceCount = starCount/2; // 공백 Count. 소수점은 묵시적 형변환 트런케잍
		int starPrintCount = 1;		
		boolean reverse = false; 
		
		
		do {
			String spaceResult = ""; 
			String starResult = ""; 
			
			for (int space = 1; space <= spaceCount; space++) {				
				spaceResult += " ";
			}
			
			for (int star = 1; star <= starPrintCount; star++) {
				starResult += "*";				
			}
			
			// star 갯수 찍고, 2 씩 증가/감소
			if ( reverse ) { //감소
				starPrintCount -= 2;
				spaceCount += 1;				
			} else { // 증가	
				starPrintCount += 2; 
				spaceCount -= 1;
				reverse = starPrintCount == starCount ? true:false;
			}
			
			// 결과물 출력
			System.out.println(spaceResult + starResult + spaceResult);
			
		} while(starPrintCount != -1);

	}

}
