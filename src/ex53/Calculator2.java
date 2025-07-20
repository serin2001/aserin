package ex53;

public class Calculator2 {
	public static double divide(double a, double b) throws ArithmeticException {
		return a / b; // This will throw ArithmeticException if b is zero
	}

	public static void main(String[] args) {
		try {
			System.out.println(Calculator2.divide(3, 0)); // This will trigger the exception
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}

		// Example of a valid division
		try {
			System.out.println(Calculator2.divide(3, 2)); // This will work normally
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}
	}
}
/*
 * In this specific case, delegating the exception handling to the main method
 * generally makes more sense.
 * 
 * By allowing the main method to handle the exception, you separate the logic
 * of performing the division from the logic of handling errors. This makes the
 * divide method cleaner and focused solely on the performing the division.
 * 
 * Delegating the exception handling allows the caller (in this case, main) to
 * decide how to handle the error. Different parts of the application might want
 * to handle the same exception in different ways.
 * 
 * In Java, it is common to let methods throw exceptions rather than catching
 * them unless you can handle them meaningfully within that method. This aligns
 * with the principle of letting the caller decide how to handle exceptional
 * conditions.
 * 
 * When the method does not contain a try-catch block to catch the exception;
 * instead, it declares that it can throw an exception, and it is the
 * responsibility of the calling code to handle that exception, it can make unit
 * testing easier. You can test the divide method independently and check that
 * it throws the expected exceptions under certain conditions. This can lead to
 * more robust and maintainable code.
 */