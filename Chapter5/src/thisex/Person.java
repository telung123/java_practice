package thisEx;

public class Person {
	String name;
	int age;
	
	public Person() {
		// ����Ʈ �����ڿ��� �ٸ� �����ڷ� �ʱ�ȭ
		// ������ ���ο��� �ٸ� �����ڸ� ȣ���ϴ� ���, �����ڸ� ȣ���ϱ� ���� �Ʒ��� ���� Statement ������ ��ȿ���� �ʴ�.(������)
		// �ݵ�� !! ������ > ������ ȣ�� �� ������ ���� ���� ����, ù��° �ٿ��� �������־�� �Ѵ�.
		// age = 100; <- ���� �߻�
		this("�̸�����", 1);
		
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("�̸�: "+ name + " / ���� : "+ age);
	}
	
	// ������ ��ü ��ȯ. Return type�� ������ �ڽ��� ��ȯ�ϸ� ��
	public Person getSelf() {
		return this;	
	}

}
