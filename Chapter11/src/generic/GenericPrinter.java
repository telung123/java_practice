package generic;

/*
 * public class GenericPrinter<T> {
 * 위처럼 선언할 경우 타입에 대한 검증을 할 수 없음. 아무거나 넣을수있게됨,
 * 해서 타입에대한 Class를 생성하고, 해당 클래스를 extends 처리해야 함.
 */
public class GenericPrinter<T extends Material> {	
	
	private T material; // 참조 자료형.

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		
	}
	
	public void printing() {
		material.doPrinting();
	}
}
