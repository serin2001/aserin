package p81;

public class Motorbike extends Vehicle {
	private final int cm3;

	public Motorbike(String brand, boolean hasTuv, int cm3) {
		super(brand, hasTuv);
		this.cm3 = cm3;
	}

	public String licenceNeeded() {
		if (this.cm3 <= 50)
			return "AM";
		if (this.cm3 <= 125)
			return "A1";
		return "A2";
	}

	public int getCm3() {
		return cm3;
	}
}
