package p92;

public class Food {
	private String type;
	private boolean foul;

	public Food(String type, boolean foul) {
		this.type = type;
		this.foul = foul;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFoul() {
		return foul;
	}

	public void setFoul(boolean foul) {
		this.foul = foul;
	}
}
