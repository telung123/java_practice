package stream;

public class Customer {
	protected int id;
	protected static int idSequence;
	
	private String name;
	private int age;
	private int cost;
	
	
	
	public Customer(String name, int age) {
		this.id = idSequence;
		this.name = name;
		this.age = age;
		
		if ( age >= 15) {
			this.cost = 100; 
		} else {
			this.cost = 50;
		}
		 
		// ID 시퀀스 증식
		idSequence++;
	}
	

	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getCost() {
		return cost;
	}
	
	
	@Override
	public String toString() {
		return "Id("+ id + ")이름 : " + name + " /나이 : " + age + " / 비용 : " + cost;
	}

	
}
