package p52;

public class Main {

	public static void main(String[] args) {
		CheckoutService paypalService = new CheckoutService(new PayPalPayment());
		paypalService.processPayment(50.0);
		CheckoutService cardService = new CheckoutService(new CreditCardPayment());
		cardService.processPayment(75.0);
	}

}
