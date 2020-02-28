package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

	public static void main(String[] args) {
		// FileOutputStream의 두번째 인수로 true를 넘겨줄 경우,
		// 덮어씌워지는게 아닌 문자열이 Append 된다.
		// (기본 false - file override)
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)){
			
			// 생성한적 없는 output.txt 파일이 생성되고,
			// byte 로 작성했지만 해당되는 문자가 넣어져서 생성됨 (ABC) 
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
