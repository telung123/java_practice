package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");	

		myList.add(1, "D");
		
		System.out.println(myList);
		
		myList.removeLast();
		System.out.println(myList);
		
		myList.remove();
		System.out.println(myList);
		
		
		System.out.println("========================");
		for(int i =0, len = myList.size(); i < len; i++) {			
			System.out.println(myList.get(i));
		}
	}

}
