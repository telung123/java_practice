package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {		
		
		FileInputStream fis = null;	
		
		try {
			// a.txt 파일이 있기 때문에 Error 통과
			fis = new FileInputStream("a.txt");		
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
		
		
		// try - with resources 구문 (Auto closable. close 따로 안해도 됨)
		try(FileInputStream fis2 = new FileInputStream("b.txt")) {
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
