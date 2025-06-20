package ex81;

public class Rectangle extends Shape {
	private double width, length;

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
		return "Rechteck, B=" + width + ", L=" + length;
	}
}
