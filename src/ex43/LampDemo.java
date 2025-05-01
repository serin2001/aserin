package ex43;

public class LampDemo {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		// turn on , set brightness , dim to half , print result
		lamp.turnOn();
		System.out.println("Brightness: " + lamp.getBrightness());
		lamp.setBrightness(80);
		System.out.println("Brightness: " + lamp.getBrightness());
		lamp.dimToHalf();
		System.out.println("Brightness: " + lamp.getBrightness());
	}
}
