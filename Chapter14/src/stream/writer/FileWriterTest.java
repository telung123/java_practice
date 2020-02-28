package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");		
		
		fw.write('A');
		
		char[] buf = {'B','C','D'};
		fw.write(buf);
		fw.write(buf, 1, 1); // 1번 index ~ D까지(1개) 'C' write
		
		fw.write("안녕하세요");
		
		fw.close();
		System.out.println("end");

	}

}
