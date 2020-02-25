package exception;

public class IdFormatTest {

	private String userId;
	 
	
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) throws IdFormatException {
		if (userId == null) {
			throw new IdFormatException("null 입력불가");
		} 
		else if (userId.length() < 8 || userId.length() > 20) {
			throw new IdFormatException("올바르지 않은 길이입니다");
		}
		
		this.userId = userId;
	}


	public static void main(String[] args) {
		
		IdFormatTest idTest = new IdFormatTest();
		String myId = null;
		
		try {
			idTest.setUserId(myId);
			
		// Custom Exception 을 Type으로 지정. 
		} catch (IdFormatException e) {
			System.out.println(e);
		}
		
		String myId2 = "12345";
		try {
			idTest.setUserId(myId2);
		} catch (IdFormatException e) {
			System.out.println(e);
		}

	}

}
