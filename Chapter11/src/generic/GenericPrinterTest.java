package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		// 참조자료형으로 사용할 클래스는 생성되어 있어야 함.
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		/* Diamond 연산자 사용할 때 - new GeneridPrinter<> <- 이렇게 비우면 앞에서 선언한 타입으로 유추하여 생성 됨. */
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(powder); // 생성한 참조자료형 클래스 - Setter
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(plastic);
		
		System.out.println(powderPrinter.toString());
		System.out.println(plasticPrinter.toString());
		
		powderPrinter.printing();
		plasticPrinter.printing();		
		
	}

}
