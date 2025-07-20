package ex53;

public class Calculator {
	public static double divide(double a, double b) {
		try {
			return a / b; // This may throw ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
			return Double.NaN; // Return NaN (Not a Number) to indicate an invalid result
		}
	}

	public static void main(String[] args) {
		System.out.println(Calculator.divide(3, 0)); // This will trigger the exception handling
		System.out.println(Calculator.divide(3, 2)); // This will work normally
	}
}
/*
 * While delegating exception handling is generally preferred, there are
 * scenarios where catching exceptions within a method might be appropriate:
 * 
 * Simple Utility Methods: If the method is a simple utility that should not
 * burden the caller with exception handling, catching exceptions inside the
 * divide method might be suitable.
 * 
 * Specific Error Recovery: If the method can recover from the error in a
 * meaningful way (e.g., retrying an operation), it may make sense to catch the
 * exception and handle it internally.
 * 
 * public static int parseInt(String str) { 
 * try { 
 * return Integer.parseInt(str);
 * } catch (NumberFormatException e) {
 * System.out.println("Invalid number format. Returning 0."); return 0; //
 * Return a default value } } 
 */