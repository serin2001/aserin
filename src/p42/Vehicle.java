package p42;

public abstract class Vehicle {
	protected String id;
	protected double maxLoad;

	public Vehicle(String id, double maxLoad) {
		this.id = id;
		this.maxLoad = maxLoad;
	}
	
	public abstract double getRange();

	public abstract double fuelNeeded(double distance);
}
