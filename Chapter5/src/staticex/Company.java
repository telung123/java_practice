package staticex;

// Singleton pattern
public class Company {
	
	private static Company instance = new Company(); // 생성.(only-one)
	
	// private 선언. 외부에서 생성 불가. 디폴트 생성자를 private으로 제공함
	private Company() {}
	
	// 싱글톤 패턴에서 instance 를 반환하는 메소드는 'static' 이어야 함.
	//(인스턴스 생성 없이도 외부에서 접근 가능하게)
	public static Company getInstance() {  
		if ( instance == null ) {
			instance = new Company();
		}
		return instance;
	}

}
