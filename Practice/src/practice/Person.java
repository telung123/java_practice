package practice;

//Class 생성 실습1


public class Person {
	
	int age;
	String name;
	boolean isMarried;
	int children;
	
	public void getPersonInfo() {
		System.out.println("이름 : " + name + ", 나이 : "+ age + ", " + "결혼 : "+ isMarried + ", 자녀수 : " + children);
	}
	
	public static void main(String[] args) {
		Person james = new Person();
		james.age = 40;
		james.isMarried = true;
		james.name = "James";
		james.children = 3;
		
		james.getPersonInfo();
	}
	
}
