package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while( (i = fis.read()) != -1 ) {
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * AutoClosable 구현되어 있기 때문에 구현 안해도 됨
		finally {			
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		*/
		
		System.out.println("End");

		
	}

}
