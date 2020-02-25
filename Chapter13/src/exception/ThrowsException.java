package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws [exception name] 예외 처리 미루기
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		
		try {
			test.loadClass("b.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {			
			System.out.println(e);
			
		} catch(Exception e) {
			// Exception (디폴트 exception). 최상위 Class이기 때문에,
			// 무조건 맨 마지막에 조건을 걸어주어야 한다.
			System.out.println(e);
		}
		

	}

}
