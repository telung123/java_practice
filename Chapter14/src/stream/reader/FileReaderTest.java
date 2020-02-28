package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		FileReader fis = new FileReader("reader.txt"); 
		/* 보조스트림 InputStreamReader 사용하기.
		 * 
		 *  FileInputStream fis = new FileInputStream("reader.txt"); // byte
		 *  InputStreamReader isr = new InputStreamReader(fis); // 문자열로 변환
		 *  
		 *  밑에 while 문에서 isr.read() 로 접근
		*/ 
		int i;
		while((i = fis.read()) != -1 ) {
			System.out.print((char)i); // 한글 안깨지고 잘 나옴			
		}
		
		fis.close();
	}

}
