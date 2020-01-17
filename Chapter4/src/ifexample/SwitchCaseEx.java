package ifexample;
import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
			break;
			case 2 : medalColor = 'S';
			break;
			case 3 : medalColor = 'B';
			break;
			
			default : medalColor = 'N';
		}
		
		System.out.println(rank + "등은 " + medalColor + "색상의 메달을 받습니다.");
		

	}

}
