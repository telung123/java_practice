package card;

public class CardCompany {
	static int serialNum = 10000;
	
	private CardCompany() {} // Default 생성자
	private static CardCompany instance = new CardCompany();
	
	public static CardCompany getInstance() {
		if (instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard() { // 카드 생성
		serialNum++;
		Card card = new Card();
		card.cardKeyNum = serialNum;
		return card;
	}	

}
