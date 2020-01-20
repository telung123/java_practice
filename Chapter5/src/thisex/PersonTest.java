package thisex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoname = new Person();		
		personNoname.getInfo();
		Person noName = personNoname.getSelf();
		
		
		Person personKim = new Person("김가빈", 30);		
		personKim.getInfo();
		Person p = personKim.getSelf();
		
		System.out.println(p);
		System.out.println(noName);
	}

}
