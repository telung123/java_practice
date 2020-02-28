package stream.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for (int i = 0; i<bs.length; i++ ) { // 알파벳 Array 생성
			bs[i] = data;
			data ++;
		}		
		
		try (FileOutputStream fos = new FileOutputStream("alpha.txt", true);
			 FileInputStream fis = new FileInputStream("alpha.txt")
		){			
			fos.write(bs); // 알파벳 모두 Write
			
			int ch;
			while ((ch = fis.read()) != -1) {
				System.out.print((char)ch); // 알파벳 출력
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
