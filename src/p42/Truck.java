package p42;

public class Truck extends Vehicle implements Refuelable {
	private final double tankCapacity;
	private double fuelLevel;
	private static final double CONSUMPTION_L_PER_KM = 0.3;

	public Truck(String id, double maxLoad, double tankCapacity) {
		super(id, maxLoad);
	//	this.id = id;
	//	this.maxLoad = maxLoad;
		this.tankCapacity = tankCapacity;
		this.fuelLevel = tankCapacity;
	}

	@Override
	public void refuel(double liters) {
		fuelLevel = Math.min(tankCapacity, fuelLevel + Math.max(0, liters));
	}

	@Override
	public double getFuelLevel() {
		return fuelLevel;
	}

	@Override
	public double fuelNeeded(double distance) {
		return distance * CONSUMPTION_L_PER_KM;
	}

	@Override
	public double getRange() {
		return fuelLevel / CONSUMPTION_L_PER_KM;
	}
}
