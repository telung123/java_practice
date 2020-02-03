package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> mylist = new LinkedList<String>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		mylist.add(1, "D");
		System.out.println(mylist.toString());
		
		mylist.removeFirst();
		mylist.removeLast();
		
		System.out.println(mylist.toString());
		
		
		for ( int i = 0, len = mylist.size(); i < len; i++ ) {
			String value = mylist.get(i);
			System.out.println(value);
		}
	}

}
