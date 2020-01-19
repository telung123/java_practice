package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// 아래 두 객체는 Stack address 동일(단 하나!)
		System.out.println(company);
		System.out.println(company2); 
		
		
		// Calendar Class도 동일함
		Calendar calendar = Calendar.getInstance();
		
	}

}
