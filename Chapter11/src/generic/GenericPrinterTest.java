package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		
		// Generic 인스턴스 생성시, 아래처럼 new GenericPrinter<>(); - 다이아몬드 연산자 내부에 값을 넣지 않을 수 있다(알아서 유추 함)
//		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		
		// Generic 타입만 선언한다고 해서 타입이 생성되는게 아님. set 으로 타입 생성!
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		
		System.out.println(powderPrinter);
		powderPrinter.printing();
		
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		
		System.out.println(plasticPrinter);
		plasticPrinter.printing();
		
	}

}
