package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {

		/* DataInput/OutputStream - 자료 원형 유지하기 ( 데이터를 쓸때와 읽을때 원형이 유지 됨 ) */
		try (
			FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)
		) {
			dos.writeByte(100);// integer 지만 1byte로 처리
			dos.write(100); // 4byte
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			
			// read 할때는 write 에 매핑되는 API 그대로 읽어야 함 ( byte, char, utf)
			// 순서 바뀌면 깨짐
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch ( IOException e ) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
