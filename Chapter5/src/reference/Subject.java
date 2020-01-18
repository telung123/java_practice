package reference;

public class Subject {
	String subjectName;
	int subjectScore = 0;
	
	// 과목 목록
	String korea = "국어";
	String math = "수학";
	
	// 과목 점수
	int koreaScore;
	int mathScore;
	
	
	public int getSubjectScore(String name) {
		int score;
		
		switch(name) {
			case "korea": score = koreaScore; break;
			case "math": score = mathScore; break;
			default : score = 0;
		}
		
		return score;
	}
}
