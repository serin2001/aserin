package p42;

public class FleetDemo {

	public static void main(String[] args) {
		Truck truck = new Truck("T-900", 8000, 300);
		EVan van = new EVan("E-200", 2000, 100);
		double trip = 300;
		System.out.println("--- Initial state ---");
		System.out.printf("Truck can reach %.1f km%n", truck.getRange());
		System.out.printf("EVan  can reach %.1f km%n", van.getRange());
		
		
		System.out.println("\nCan each reach " + trip + " km? ->");
		System.out.println("Truck: " + truck.canReach(trip));
		System.out.println("EVan : " + van.canReach(trip));
		
		System.out.println("\n--- Refuel / Charge ---");
		truck.refuel(50);
		van.charge(20);
		
		System.out.printf("Truck fuelLevel: %.1f l, new range: %.1f km%n", truck.getFuelLevel(), truck.getRange());
		System.out.printf("EVan battery  : %.1f kWh, new range: %.1f km%n", van.getBatteryLevel(), van.getRange());
		
		System.out.println("\nCan each reach " + trip + " km now? ->");
		System.out.println("Truck: " + truck.canReach(trip));
		System.out.println("EVan : " + van.canReach(trip));
	}

}
