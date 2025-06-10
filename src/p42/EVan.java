package p42;

public class EVan extends Vehicle implements Electrified {
	private final double batteryCapacity;
	private double batteryLevel;
	private static final double CONSUMPTION_KWH_PER_KM = 0.25;

	public EVan(String id, double maxLoad, double batteryCapacity) {
		super(id, maxLoad);
		// this.id = id;
		// this.maxLoad = maxLoad;
		this.batteryCapacity = Math.min(batteryCapacity, MAX_BATTERY_KWH);
		this.batteryLevel = this.batteryCapacity;
	}

	@Override
	public void charge(double kWh) {
		batteryLevel = Math.min(batteryCapacity, batteryLevel + Math.max(0, kWh));
	}

	@Override
	public double getBatteryLevel() {
		return batteryLevel;
	}

	@Override
	public double getRange() {
		return batteryLevel / CONSUMPTION_KWH_PER_KM;
	}

	@Override
	public double fuelNeeded(double distance) {
		return distance * CONSUMPTION_KWH_PER_KM;
	}
}
