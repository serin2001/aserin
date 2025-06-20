package p81;

public abstract class Vehicle {
	private String brand;
	private boolean hasTuv;

	public Vehicle(String brand, boolean hasTuv) {
		this.brand = brand;
		this.hasTuv = hasTuv;
	}

	public String getBrand() {
		return this.brand;
	}

	public boolean getHasTuv() {
		return this.hasTuv;
	}

	public void setHasTuv(boolean hasTuv) {
		this.hasTuv = hasTuv;
	}
}
