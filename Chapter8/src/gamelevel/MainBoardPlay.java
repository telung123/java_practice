package gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player kim = new Player();
		kim.play(1);
		
		PlayerLevel aLevel = new AdvancedLevel();
		kim.upgradeLevel(aLevel);
		kim.play(2);
		
		PlayerLevel sLevel = new SuperLevel();
		kim.upgradeLevel(sLevel);
		kim.play(3);
	}

}
