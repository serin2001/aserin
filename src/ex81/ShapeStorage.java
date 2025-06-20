package ex81;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
	double getTotalArea() {
		double sum = 0;
		for (T shape : this) {
			sum += shape.getArea();
		}
		return sum;
	}

	public void displayAllShapes() {
		for (T shape : this) {
			System.out.println(shape.toString());
		}
	}

	public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea) {
		for (U shape : other) {
			if (shape.getArea() >= minArea)
				this.add(shape);
		}
	}
}
