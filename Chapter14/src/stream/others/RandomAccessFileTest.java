package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		// 읽을 파일 지정, rw - mode 
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println(rf.getFilePointer()); // 4byte 이므로 4 출력 ( writeInt)
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		System.out.println(rf.getFilePointer()); // 29 출력 (현재 위치 writeUTF - 안녕하세요)
		
		/* 아래처럼 최초 지정한 Int 를 읽기위해 readInt() 를 바로 호출할 경우,
		 * RandomAccessFile 은 데이터를 쓰면서 '이동' 하기 때문에, 현재 위치는 writeUTF() 가 되므로 오류가 난다.
		 * 		int i = rf.readInt();
		 * 따라서 처음부터 읽고싶을 경우 처음 위치로 되돌려줘야함.
		*/ 
		
		rf.seek(0); // 처음 위치로 되돌리기
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
	}

}
