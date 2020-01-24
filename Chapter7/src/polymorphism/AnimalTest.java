package polymorphism;

import java.util.ArrayList;

import com.sun.crypto.provider.HmacMD5;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

// 상속받은 'move' method overriding
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다");
	}
	
	public void readBooks() {
		System.out.println("책 읽음");
	}
}


class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다");
	}
	
	public void hunting() {
		System.out.println("사냥");
	}
}



public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		// 다운 캐스팅. 하위클래스 인스턴스 참조를 위해서 사용
		Human human = (Human)hAnimal;
		human.readBooks();
		Tiger tiger = (Tiger)tAnimal;
		
		
		if (hAnimal instanceof Tiger) {
			// 만약 아래 코드를 instanceof 없이 작성할 경우, 문법오류는 안나지만 안돌아감!!
			Tiger tigerReal = (Tiger)hAnimal; 
			tigerReal.hunting();
		}
		
		if (tAnimal instanceof Tiger) {
			tiger.hunting();
		}
		
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		
		// Animal 형태 arrayList 생성
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		
		for (Animal animal: animalList) {
			animal.move();
		}
		System.out.println("====================");
		test.downCastingTest(animalList);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	public void downCastingTest(ArrayList<Animal> list) {
		for ( int i = 0, len = list.size(); i < len ;i++ ) {
			Animal animal = list.get(i);
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} 
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else {
				System.out.println("Error");
			}
		}
		
	}
}
