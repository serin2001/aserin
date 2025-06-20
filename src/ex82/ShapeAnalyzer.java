package ex82;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class ShapeAnalyzer {
	static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea) {
		List<Shape> list = new ArrayList<>();

		for (Shape s : shapes) {
			if (s.getArea() >= minArea) {
				list.add(s);
			}
		}
		return list;
	}

	public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
		if (shapes == null || shapes.isEmpty()) {
			return null;
		}
		Shape shape = null;
		double area = Double.NEGATIVE_INFINITY;

		for (Shape s : shapes) {
			if (s.getArea() > area) {
				shape = s;
				area = s.getArea();
			}
		}
		return shape;
	}

	public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes) {
		Map<String, List<T>> map = new HashMap<>();

		for (T temp : shapes) {
			String name = temp.getClass().getSimpleName();
			map.computeIfAbsent(name, k -> new ArrayList<>()).add(temp);
		}
		return map;
	}
}
/*
 * 1) Java generics are invariant -> Collection<Circle> is not a subtype of
 * Collection<Shape>. With <? extends Shape> the method accepts any subtype
 * while still safely reading elements as Shape
 * 
 * 2) Using <T extends Shape> preserves the type of the elements inside the
 * resulting Map<String, List<T>>
 * 
 * 3) ShapeAnalyzer is a utility class that performs operations on Collections.
 * Methods operate purely on input, there are no variables.
 */