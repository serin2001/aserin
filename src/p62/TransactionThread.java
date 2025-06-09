package p62;

public class TransactionThread extends Thread {
	private BankAccount account;

	public TransactionThread(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			account.deposit(1);
			account.withdraw(1);
		}
	}
}