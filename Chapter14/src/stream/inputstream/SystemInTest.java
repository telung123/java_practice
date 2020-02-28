package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("입력:");
		/*
		 * System.in - byte 단위로 읽어들임 (inputStream)
		 * read 반환값 int. (1byte 로 읽지만 4byte로 반환하는 이유 : 파일의 끝에 도달했을때 -1을 반환함
		 * */
		try {
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
