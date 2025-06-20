package p81;

import java.util.ArrayList;

public class Junkyard {
	private final ArrayList<? super Vehicle> trashedCars = new ArrayList<>();

	public <A extends Vehicle> void destroyVehicle(A vehicle) {
		if (!vehicle.getHasTuv()) {
			this.trashedCars.add(vehicle);
			System.out.println(vehicle.getClass().getName() + " trashed!");
		}
	}

	public ArrayList<? super Vehicle> getTrashedCars() {
		return this.trashedCars;
	}
}
