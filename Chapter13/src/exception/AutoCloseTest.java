package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		// 성공/실패와 상관 없이 close 자동 호출 됨
		try( AutoCloseObject obj = new AutoCloseObject()){
			// 강제 예외 발생
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);			
		}

	}

}
