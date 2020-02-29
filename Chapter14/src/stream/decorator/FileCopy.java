package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {
	
	public static void main(String[] args) throws IOException {
		long milliseconds = 0;
		
		try (
				FileInputStream fis = new FileInputStream("sample.pdf");
				FileOutputStream fos = new FileOutputStream("copy.pdf");
				/* Buffered - 시간 소요 매우 줄어듬 - fileInput/OutputStream 시간소요 : 6644ms / Buffered 시간소요 : 94ms
				 * Default buffer size - 8kb
				 * */
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)
		){
			milliseconds = System.currentTimeMillis(); // 현재 시간
			
			int i;
			while ( (i = bis.read()) != -1) {
				bos.write(i);
			}
			milliseconds = System.currentTimeMillis() - milliseconds; // 시간차
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("시간 소요 : " + milliseconds);
		
		
		/* 보조스트림을 보조스트림으로 연결하기 - 데코레이터 패턴
		 * 1. socket.getInputStream() - 소켓을 byte 단위로 읽기
		 * 2. getInputStream -> InputStreamReader : byte 단위를 문자열로 읽게 하기
		 * 3. InputStreamReader -> BufferedReader : 버퍼링 구현  (더 빠르게 읽게 하기)
		 * */
		Socket socket = new Socket();
		BufferedReader isr = new BufferedReader(new InputStreamReader( socket.getInputStream()));
		
		// isr.readLine() - 한줄단위로 읽기 ( 버퍼드 리더에만 있음)
		
	}
}
