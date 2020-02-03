package generic;

public class Powder extends Material {
	public String toString () {
		return "재료: 파우더";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 입니다.");		
	}
}
