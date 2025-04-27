package ex31;

public class AccountManager {
	public void accessAccount(Account account) {
		System.out.println(account.owner);
		System.out.println(account.getBalance());
		System.out.println(account.pin);
		System.out.println(account.internalNote);
	}
}
