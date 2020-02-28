package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputTestWhile {

	public static void main(String[] args) {
		// close 사용을 위해 변수 여기서 선언!
		FileInputStream fis = null;
		
		try {
			// 어디서 읽을지 파일 지정 - input.txt
			fis = new FileInputStream("input.txt");
			
			// 끝까지 읽고싶은경우 While. -1 일 때까지.
			int i;
			while( (i = fis.read()) != -1 ) {
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {			
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End");
		
	}

}
