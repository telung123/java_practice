package exception;

// 사용자 정의 Exception 만들기
public class IdFormatException extends Exception {
	
	public IdFormatException(String message) {
		super(message);
	}

}
