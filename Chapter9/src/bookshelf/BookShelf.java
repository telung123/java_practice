package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 맨앞부터 제거
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
