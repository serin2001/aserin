package p42;

public interface Electrified {
	double MAX_BATTERY_KWH = 120;

	void charge(double kWh);

	double getBatteryLevel();
	
	default boolean canReach(double distance) {
		if (this instanceof Vehicle v)
			return v.getRange() >= distance;
		else
			return false;
	}
}
