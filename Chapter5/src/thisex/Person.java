package thisex;

public class Person {
	String name;
	int age;
	
	public Person() {
		// 디폴트 생성자에서 다른 생성자로 초기화
		// 생성자 내부에서 다른 생성자를 호출하는 경우, 생성자를 호출하기 전에 아래와 같이 Statement 변경은 유효하지 않다.(오류남)
		// 반드시 !! 생성자 > 생성자 호출 시 별도의 상태 변경 없이, 첫번째 줄에서 선언해주어야 한다.
		// age = 100; <- 오류 발생
		this("이름없음", 1);
		
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("이름: "+ name + " / 나이 : "+ age);
	}
	
	// 생성자 자체 반환. Return type은 생성자 자신을 반환하면 됨
	public Person getSelf() {
		return this;	
	}

}
