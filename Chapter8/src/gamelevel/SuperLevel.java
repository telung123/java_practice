package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump");
		
	}

	@Override
	public void turn() {
		System.out.println("빠르게 Turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 상급자 레벨입니다. ********");
	}

}
