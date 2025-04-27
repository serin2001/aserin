package ex31;

public class Account {
	public String owner;
	private double balance;
	protected int pin;
	String internalNote;

	public Account(String owner, double balance, int pin) {
		this.owner = owner;
		this.balance = balance;
		this.pin = pin;
		this.internalNote = "No notes";
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean changePin(int currentPin, int newPin) {
		if (this.pin == currentPin) {
			this.pin = newPin;
			return true;
		} else
			return false;
	}
	// Alternative
	public String getInternalNote() {
		return this.internalNote;
	}
	// Alternative
	public int getPin() {
		return this.pin;
	}
}
