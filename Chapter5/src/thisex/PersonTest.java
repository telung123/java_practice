package thisEx;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoname = new Person();		
		personNoname.getInfo();
		Person noName = personNoname.getSelf();
		
		
		Person personKim = new Person("±è°¡ºó", 30);		
		personKim.getInfo();
		Person p = personKim.getSelf();
		
		System.out.println(p);
		System.out.println(noName);
	}

}
