package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTestHangul {

	public static void main(String[] args) {
		
		System.out.println("입력:");

		try {
			int i;
			
			// 보조스트림. 다른 스트림을 인수로 받는다.
			// byte 로 받은 data를 문자로 바꿔줌
			InputStreamReader isr = new InputStreamReader(System.in); 
			while ( (i = isr.read()) != '끝') { // '끝' 입력까지
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
