package ex81;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
	double getTotalArea() {
		double sum = 0;
		int n = 0;
		while (n < size()) {
			sum += this.get(n).getArea();
			n++;
		}
		return sum;
	}

	public void displayAllShapes() {
		int n = 0;
		while (n < size()) {
			System.out.println(this.get(n).toString());
			n++;
		}
	}

	<U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea) {
		int n = 0;
		while (n < other.size()) {
			if (other.get(n).getArea() >= minArea)
				this.add(other.get(n));
			n++;
		}
	}
}
