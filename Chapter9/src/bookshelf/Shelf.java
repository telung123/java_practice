package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	
	public Shelf() {
		// 인스턴스 생성은 주로 Constructor 에서 함
		shelf = new ArrayList<String>();
	}
	
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
