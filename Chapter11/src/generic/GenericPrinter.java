package generic;

// 재료가 Powder, plastic ... 여러개 일 수도 있을때.
// T = type
public class GenericPrinter<T extends Material> {
	
	private T material;

	
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	// 제네릭 메서드
	public void printing() {
		material.doPrinting();
	}
}
