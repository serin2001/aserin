package p52;

public class CreditCardPayment implements PaymentProvider {
		@Override
		public void pay(double amount) {
			System.out.println("Paid " + amount + " Euro with credit card.");
		}
	}
