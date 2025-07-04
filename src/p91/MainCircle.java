package p91;

public class MainCircle {

	public static void main(String[] args) {
		Circle diameter = (radius) -> radius > 0 ? 2 * radius : 0;
		Circle surface = (radius) -> radius > 0 ? Math.PI * radius * radius : 0;
		Circle circumference = (radius) -> radius > 0 ? Math.PI * 2 * radius : 0;
		
		double rad = 5;
		
		System.out.println("Diameter: " + diameter.calc(rad));
		System.out.println("Surface: " + surface.calc(rad));
		System.out.println("Circumference: " + circumference.calc(rad));
		System.out.println(Circle.validRadius(rad));
	}
}
/*
 * (1) What are the advantages of using lambda expressions instead of regular methods? 
 * The code becomes more readable. There’s no need to create a separate class to implement them. Useful for single purpose methods. Fewer lines of code.
 * (2) Can you add more methods into the interface? If so, would make sense to do so?
 * Yes, you can add default/static methods but no more abstract methods. Default methods can be useful in functional interfaces, e.g., for helper methods.
 */