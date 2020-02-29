package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		System.out.println();
		
		//케냐 라떼 만들기. 
		Coffee kenyalatte = new Latte(new KenyaAmericano());
		kenyalatte.brewing();
		
		System.out.println();
		
		//에티오피아 모카 만들기 ( 에티오피아 + 우유 + 모카시럽)
		Coffee etiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaMocha.brewing();
		
		/* Latte, Mocha - Decorator . 
		 * Decorator 는 같은 Decorator 를 상속받을 수 있고,
		 * 혹은 콘크리트 class 를 상속받을 수 도 있다.
		 * 하지만 제일 내부는 콘크리트 Class 여야 함. 
		 * */
	}

}
