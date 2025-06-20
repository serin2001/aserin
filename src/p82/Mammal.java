package p82;

public abstract class Mammal {
	private String name;

	public Mammal(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object m) {
		if (m instanceof Mammal)
			return this.getClass().equals(((Mammal) m).getClass());
		return false;
	}

	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
