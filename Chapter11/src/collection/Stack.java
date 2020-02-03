package collection;

import java.util.ArrayList;

class MyStack {
	// LIFO Stack 구현해보기
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if ( len == 0 ) {
			System.out.println("Stack 이 비었습니다.");
			return null;
		} 
		return arrayStack.remove(len-1);
	}
}

public class Stack {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("POP : "+ stack.pop());
		System.out.println("POP : "+ stack.pop());
		System.out.println("POP : "+ stack.pop());
		System.out.println("POP : "+ stack.pop());
				
	}

}
