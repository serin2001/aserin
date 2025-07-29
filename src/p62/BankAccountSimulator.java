package p62;

public class BankAccountSimulator {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		try {
			Thread t1 = new TransactionThread(account);
			Thread t2 = new TransactionThread(account);

			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final balance: " + account.getBalance());
	}
}
