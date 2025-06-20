package p81;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Junkyard one = new Junkyard();
		
		Motorbike bike1 = new Motorbike("Yamaha", true, 51);
		Motorbike bike2 = new Motorbike("BMW", false, 150);
		Convertible conv1 = new Convertible("Mercedes", false, 560);
		
		one.destroyVehicle(bike1);
		one.destroyVehicle(bike2);
		one.destroyVehicle(conv1);
		ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>) (ArrayList<?>) one.getTrashedCars();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getBrand());
        }
	}

}
