package generic;

public class Rectangle extends Figure {	
	
	public Rectangle() {
		this.setName("직사각형");
	}

	@Override
	public String getFigureName() {	
		return this.getName();
	}
}
