package p81;

public class Convertible extends Vehicle {
	private final int horsePower;

	public Convertible(String brand, boolean hasTuv, int horsePower) {
		super(brand, hasTuv);
		this.horsePower = horsePower;
	}

	public boolean FourWheelDrive() {
		return false;
	}

	public int numSeats() {
		return 2;
	}

	public int getHorsePower() {
		return this.horsePower;
	}
}
