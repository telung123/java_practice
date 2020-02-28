package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		// Console - 이클립스랑 연동 안됨.
		// 굳이 돌려보려면 아래처럼 CMD 에서 실행
		//E:\workspace\java_practice\Chapter14 > java stream.inputstream.ConsoleTest
		
		Console console = System.console();
		System.out.println("이름:");
		String name = console.readLine();
		
		System.out.println("비밀번호:");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
		

	}

}
