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
		Iterator<? extends Shape> iterator = shapes.iterator();
		while (iterator.hasNext()) {
			Shape temp = iterator.next();
			if (temp.getArea() >= minArea) {
				list.add(temp);
			}
		}
		return list;
	}

	static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
		Shape shape = new Circle(1);
		double area = 0;
		Iterator<? extends Shape> iterator = shapes.iterator();
		while (iterator.hasNext()) {
			Shape temp = iterator.next();
			if (temp.getArea() > area) {
				shape = temp;
				area = temp.getArea();
			}
		}
		return shape;
	}

	static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes) {
		Map<String, List<T>> map = new HashMap<>();
		Iterator<T> iterator = shapes.iterator();
		while (iterator.hasNext()) {
			T temp = iterator.next();
	        if (!map.containsKey(temp.getClass().getSimpleName())) {
	            map.put(temp.getClass().getSimpleName(), new ArrayList<T>());
	        }
			map.get(temp.getClass().getSimpleName()).add(temp);
		}
		return map;
	}
}
