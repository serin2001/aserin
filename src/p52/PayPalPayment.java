package p52;

public class PayPalPayment implements PaymentProvider {
	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " Euro with Paypal.");
	}
}
