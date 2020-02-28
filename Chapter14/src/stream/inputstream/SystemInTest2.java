package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("입력:");

		try {
			int i;
			while ( (i = System.in.read()) != '\n') { // 엔터키 칠때까지
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
