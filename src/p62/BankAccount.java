package p62;

public class BankAccount {
	private int balance;

	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}

	public synchronized void deposit(int amount) {
		balance += amount;
	}

	public synchronized void withdraw(int amount) {
		balance -= amount;
	}

	public synchronized int getBalance() {
		return balance;
	}
}
/*
 * Threads t1 and t2 are concurrently accessing the same BankAccount instance.
 * Each thread performs a series of deposits and withdrawals.
 * 
 * A race condition occurs in a concurrent system when two or more threads
 * access shared data and try to change it at the same time. To demonstrate a
 * race condition, the BankAccount class should use non-synchronized deposit(),
 * withdraw(), and getBalance() methods. This will allow multiple threads to
 * access and modify the balance concurrently without any synchronization,
 * leading to potential inconsistencies in the final balance. The final outcome
 * depends on the timing of their execution, leading to unpredictable and
 * incorrect results.
 * 
 * The methods deposit, withdraw, and getBalance are synchronized, which means
 * that only one thread can execute any of these methods at a time.
 * 
 * When one thread is executing a synchronized method, no other thread can
 * execute any synchronized method on the same object. This prevents race
 * conditions, ensuring that the balance is updated correctly and consistently.
 */