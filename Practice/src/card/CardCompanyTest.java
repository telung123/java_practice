package card;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		Card card2 = company.createCard();
		
		card1.getCardNumber(); // 카드번호 출력 
		card2.getCardNumber(); // 카드번호 출력 
	}

}
