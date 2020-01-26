package generic;

public class Circle extends Figure {
	
	
	// Constructor
	public Circle() {
		this.setName("동그라미");
	}

	@Override
	public String getFigureName() {
		return this.getName();		
	}
	
}
