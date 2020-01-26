package generic;

public class Triangle extends Figure {

	public Triangle() {
		this.setName("세모");
	}
	
	@Override
	public String getFigureName() {		
		System.out.print("하이룽 세모 ");
		return "나는 세모!!!";
	}
}
