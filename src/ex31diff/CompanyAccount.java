package ex31diff;

import ex31.Account;

public class CompanyAccount extends Account {
	
	public CompanyAccount(String owner, double balance, int pin) {
		super(owner, balance, pin);
	}

	public void accessAccount(CompanyAccount account) {
		System.out.println(account.owner);
		System.out.println(account.getBalance());
		System.out.println(account.pin);
		// System.out.println(account.internalNote);
		/*
		 * Explain which accesses fail and why.
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
		 * The field Account.internalNote is not visible
		 * see slide 17 of lecture 2
		 * What is the difference between using protected vs. using private and providing a getter for subclasses to access an instance variable?
		 * Trying to access pin through an instance of Account will cause a compilation error. Access pin directly in CompanyAccount, but not through an Account reference.
		 * see slide 17 of lecture 2
		 */
		// Suggest alternative designs (e.g., getters).
		System.out.println(account.getInternalNote());
		System.out.println(account.getPin());
	}
}
