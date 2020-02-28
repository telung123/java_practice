package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputTestByteArray {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("inputByteArray.txt")) {
			int i;
			byte[] bs = new byte[10];
			while( (i = fis.read(bs)) != -1 ) {
				/*
				 * 아래처럼 출력할 경우, 총 30번을 반복하면서 4개의 가비지data가 출력되게 됨.
				 * ABCDEFGHIJ
				   KLMNOPQRST
				   UVWXYZQRST - QRST : 전 Loop의 가비지.
				   
				for (byte b : bs) {
					System.out.print((char)b);
				}
				*/
				// 갯수 만큼 읽어서 출력
				for (int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
					
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}

}
