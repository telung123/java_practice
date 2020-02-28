package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputTest1 {

	public static void main(String[] args) {
		// close 사용을 위해 변수 여기서 선언!
		FileInputStream fis = null;
		
		try {
			// 어디서 읽을지 파일 지정 - input.txt
			fis = new FileInputStream("input.txt");
			
			// 파일 읽기 - input.txt의 내용은 'hello' .
			// 아래처럼 3번 호출하면 h, e, l 이 찍히게된다 (byte로 가져오기 때문임)
			int i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			
			// 끝까지 읽고싶은경우 While. -1 일 때까지.
			
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
