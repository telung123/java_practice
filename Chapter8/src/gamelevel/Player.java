package gamelevel;

public class Player {
	private PlayerLevel level;
	
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	// method
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	
	public void play(int count) {
		level.go(count);
	}
	
	
	// getter/setter
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}

	public PlayerLevel getLevel() {
		return level;
	}
}
