package p91;

@FunctionalInterface
public interface Circle {
	public double calc(double radius);

	public static boolean validRadius(double radius) {
		return radius > 0;
	}
}
