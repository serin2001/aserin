package p82;

public class Insect {
	private final int numLegs;
	private final String name;

	public Insect(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public String getName() {
		return name;
	}
}
