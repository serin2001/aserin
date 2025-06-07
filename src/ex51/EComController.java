package ex51;

public class EComController {
	public static void main(String[] args) {
		ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
		Profile profile = new Profile(info);
		Customer customer = new Customer(profile, 123);
		/*
		 * This line violates the Law of Demeter. EComController is reaching through
		 * multiple layers of objects to get to the city information, which makes it
		 * dependent on the internal structure of the Customer and Profile classes.
		 * A possible fix: 1) Add a method in the Customer class to retrieve the city directly.
		 * public String getShippingCity() {
		 * 	return profile.getShippingInfo().getCity(); 
		 * }
		 * 2) Use
		 * System.out.println("Shipping to: " + customer.getShippingCity());
		 * instead of the following line
		 */
		System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
	}
}
/*
 * In the current structure, the Profile class is dependent on ShippingInfo, and
 * the Customer class is dependent on Profile. However, the way these
 * dependencies are instantiated in the EComController class does not utilize
 * dependency injection effectively. Instead, it tightly couples the creation of
 * these objects within the main method.
 */