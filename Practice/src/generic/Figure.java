package generic;

public abstract class Figure {
	private String name;
	
	public abstract String getFigureName();	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
}
