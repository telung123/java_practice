package object;


class Student{
	int studentId;
	String studentName;
	
	public Student (int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	/* equals == hashCode 의 일치성을 보존해주기 위해
	 * equals() 가 재정의 되면, hashCode 도 같은 boolean 을 반환할 수 있게 재정의 해준다.
	 * equals 에 사용된 멤버를 활용하면 됨
	 * (아래의 경우 studentId 로 비교하였기 때문에, hashCode 에는 studentId를 반환하도록 처리한다)
	 * */  
	@Override
	public boolean equals(Object obj) {		
		if ( obj instanceof Student) {
			Student std = (Student)obj;
			return (std.studentId == this.studentId); // 논리적 Equals 체크
		}		
		return false;		
	}


	@Override
	public int hashCode() {	
		return studentId;
	}	
	
}


public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("메모리 주소가 같은가 ? : " + (str1.hashCode() == str2.hashCode()));
		System.out.println("논리적으로 같은가? : " + str1.equals(str2));
		
		Student kim = new Student(100, "김가빈");
		Student kim2 = kim;
		System.out.println(kim == kim2);
		
		Student kim3 = new Student(100, "김가빈");
		
		/*
		 * 아래 equals 메서드는 오버라이드 전에는 메모리주소를 비교하기 때문에 false 를 반환한다.
		 * class Student 인스턴스에서 equals() 를 override 해주었기 때문에 true 를 반환해주는 것임 */
		System.out.println(kim.equals(kim3));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		// 실제 메모리 HashCode 는 상이함
		System.out.println("i1 : "+System.identityHashCode(i1));
		System.out.println("i2 : "+System.identityHashCode(i2));
		System.out.println("i1, i2 equals 비교 : "+i1.equals(i2));
		System.out.println(i1.hashCode());			
		System.out.println("i1, i2 hashCode 비교 : "+ (i1.hashCode() == i2.hashCode()));
		System.out.println();
		
		
		Integer i3 = 100; // i3, i4 - 메모리주소 동일
		Integer i4 = 100;
		System.out.println("i3 : "+ System.identityHashCode(i3));
		System.out.println("i4 : "+ System.identityHashCode(i4));
		System.out.println();

		
		
		Integer i5 = 100; // i5, i6 - 메모리주소 상이
		Integer i6 = 200;
		System.out.println("i5 : "+ System.identityHashCode(i5));
		System.out.println("i6 : "+ System.identityHashCode(i6));
		System.out.println();
		
		

	}

}
