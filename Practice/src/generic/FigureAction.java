package generic;

public class FigureAction<T extends Figure> {
	
	T figure;
	
	public void setFigure(T figure) {
		this.figure = figure;		
	}
	
	
	public String getName() {
		return figure.getFigureName();		
	}
	
	public static void main(String[] arg) {
		// 제네릭 Class 생성
		FigureAction<Circle> circleAction = new FigureAction<Circle>();
		FigureAction<Triangle> triAction = new FigureAction<Triangle>();
		FigureAction<Rectangle> rectAction = new FigureAction<Rectangle>();

		// 타입 생성
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangle rect = new Rectangle();
		// 타입 지정
		circleAction.setFigure(circle);
		triAction.setFigure(triangle);
		rectAction.setFigure(rect);
		
		
		
		System.out.println(circleAction.getName());
		System.out.println(triAction.getName());
		System.out.println(rectAction.getName());
	}
}
