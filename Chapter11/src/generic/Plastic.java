package generic;

public class Plastic extends Material {
	public String toString () {
		return "재료: 플라스틱";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 입니다.");		
	}

}
