package ex82;

public abstract class Shape {
	public abstract double getArea();

	public abstract String toString();
}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public String toString() {
		return "Circle: radius=" + radius;
	}
}

class Rectangle extends Shape {
	double width, length;

	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		return width * length;
	}
	@Override
	public String toString() {
		return "Rectangle: width=" + width + ", length=" + length;
	}
}

