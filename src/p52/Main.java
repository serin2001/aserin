package p52;

public class Main {
	public static void main(String[] args) {
		CheckoutService paypalService = new CheckoutService(new PayPalPayment());
		paypalService.processPayment(50.0);
		CheckoutService cardService = new CheckoutService(new CreditCardPayment());
		cardService.processPayment(75.0);
	}

}
/*
 * 1) Which SOLID principles can you identify in your design ?
 * 
 * Single Responsibility Principle (SRP): Each class has one responsibility:
 * PayPalPayment and CreditCardPayment handle payments, CheckoutService
 * processes them.
 * 
 * Open-Closed Principle (OCP): The system can be extended with new payment
 * providers without modifying existing classes.
 * 
 * Liskov Substitution Principle (LSP): Any class implementing PaymentProvider
 * can be used by CheckoutService without affecting its correctness.
 * 
 * Interface Segregation Principle (ISP): The PaymentProvider interface is focused 
 * and does not force implementations to include methods that are not relevant to them. 
 * Each payment method only needs to implement the pay(double amount) method.
 * 
 * Dependency Inversion Principle (DIP): CheckoutService depends on the
 * PaymentProvider abstraction, not on specific implementations
 * 
 * 2) How does your code fulfill the Open-Closed Principle?
 * 
 * Open-Closed Principle: New payment methods can be added by creating new
 * classes that implement PaymentProvider. CheckoutService does not need to
 * change, which means the system is open for extension, closed for
 * modification.
 * 
 * 3) Why can CheckoutService work with any PaymentProvider implementation? (->
 * Liskov Substitution Principle)
 * 
 * Subclasses (or implementations) can be used wherever the superclass (or
 * interface) is expected. CheckoutService only relies on the PaymentProvider
 * interface. Any class implementing this interface can be passed in and used
 * without breaking or altering the logic.
 * 
 * 4) Your colleague suggests extending the PaymentProvider interface with
 * additional methods such as void validateCard(); and void checkCreditScore();
 * in order to bundle all payment types into a single interface. Would this
 * violate any of the SOLID principles?
 * 
 * Adding these methods to the interface PaymentProvider violate the Interface
 * Segregation Principle. Because some providers (like PayPal) may not need
 * methods like validateCard() or checkCreditScore(). They would be forced to
 * implement methods they don't use (Violation).
 */