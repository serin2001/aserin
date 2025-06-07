package ex52;

public class EComController {
	public static void main(String[] args) {
		try {
			ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
			Profile profile = new Profile(info);
			Customer customer = new Customer(profile, 123);

			System.out.println("Shipping to: " + customer.getShippingCity());
		} catch (InvalidShippingInfoException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (MissingShippingInfoException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidCustomerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
/*
 * When an exception is thrown but not caught in Java, the program will
 * terminate, an error message will be displayed along with a stack trace,
 * resources may not be cleaned up properly, and the program's state may become
 * inconsistent.
 * 
 * Catching specific exceptions rather than a general Exception leads to
 * clearer, more maintainable, and more robust code. It allows for tailored
 * error handling, easier debugging, and encourages best practices in software
 * design. By being specific about the exceptions you handle, you can create a
 * more reliable and user-friendly application.
 * 
 * One should use try-with-resources when working with any resource that needs
 * to be closed after use. The advantages include automatic resource management,
 * cleaner and more maintainable code, need to write repetitive code to close
 * resources in a finally block, and improved exception handling. This feature
 * significantly enhances the robustness and readability of Java code.
 */