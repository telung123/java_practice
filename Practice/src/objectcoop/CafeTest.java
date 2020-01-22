package objectcoop;

public class CafeTest {

	// 카페 - 사람 객체협력 Test
	public static void main(String[] args) {
		
		// 스타벅스 생성, 메뉴 설정
		Cafe cafeStar = new Cafe("스타벅스");
		cafeStar.setMenu("아메리카노", 3600);
		cafeStar.setMenu("카페라떼", 4500);
		
		// 커피빈 생성, 메뉴 설정
		Cafe cafeBean = new Cafe("커피빈");
		cafeBean.setMenu("아메리카노", 4000);
		cafeBean.setMenu("카페라떼", 5500);
		
		// 사용자 생성
		Person kim = new Person("김랄라", 10000);
		Person lee = new Person("이박사",20000);		
		
		// 사용자 카페메뉴 이용
		kim.useCafe(cafeStar, "카페라떼");
		lee.useCafe(cafeStar, "아메리카노");		
		
		lee.useCafe(cafeBean, "아메리카노");
		
		// 사용자 잔액 , 카페 수입 확인
		cafeStar.getCafeIncome();
		cafeBean.getCafeIncome();
		
		System.out.println("=====================");
		kim.getPersonBalance();
		lee.getPersonBalance();
		
		
	}

}
