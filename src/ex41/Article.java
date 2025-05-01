package ex41;

public abstract class Article {
	int discountThreshold;
	int householdLimit;

	public abstract int getBulkDiscount();

	public abstract boolean showWarning();

	public static void main(String[] args) {
		Milk milk = new Milk(25, 10, 5);
		Flour flour = new Flour(10, 10, 3);
		System.out.println("Milk discount: " + milk.getBulkDiscount());
		System.out.println("Milk warning: " + milk.showWarning());
		System.out.println("Flour discount: " + flour.getBulkDiscount());
		System.out.println("Flour warning: " + flour.showWarning());
	}
}
