package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// implements - Serializable 선언해줘야 직렬화 가능함
// = Mark interface (구현부없이 선언만 하는 interface = Clonable 과 같음)
class Person implements Serializable{
	String name;
	transient String job; // transient - 직렬화 금지 키워드
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + " , " + job;
	}
}


/* Externalizable - read 와 write 를 직접 구현 가능 함.
 * 내부적으로 Serializable 상속받고 있음 (super)
 * */
class Person2 implements Externalizable{
	String name;
	transient String job; // transient - 직렬화 금지 키워드
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}



public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "장군");
		Person personKim = new Person("김가빈", "퍼블");
		
		try (
			FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)
		){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
		try(
			FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)
		){
			// 안전하게 하기 위해서는 instanceof 쓰는게 좋음
			Person p1  = (Person)ois.readObject();
			Person p2  = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch(IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
