package p52;

public class CheckoutService {
	
	private PaymentProvider paymentProvider;
	
	public CheckoutService(PaymentProvider p) {
		this.paymentProvider = p;
	}
	
	public void processPayment(double amount) {
		paymentProvider.pay(amount);
	}
}
