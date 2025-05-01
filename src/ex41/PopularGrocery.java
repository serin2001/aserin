package ex41;

public abstract class PopularGrocery extends GroceryItem {
	int popularityLevel;
	int quantity;

	public PopularGrocery(int popularityLevel) {
		isPopular = true;
		this.popularityLevel = popularityLevel;
	}

	public boolean showWarning() {
		return quantity > householdLimit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
			
}
