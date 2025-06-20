package ex83;

public class ShapeFactory {
	public static Shape fromString(String input) {
		input = input.replaceAll("\\s+", "");
		input = input.replaceAll(":", ",");
		input = input.toLowerCase();
		
		String[] parts = input.split(",");
		
		if (parts[0].equalsIgnoreCase("circle") && parts[1].startsWith("radius=") && parts.length == 2){
			String rad = parts[1].replaceAll("[^0-9.]", "");
			
			if (rad.isEmpty())
				throw new IllegalArgumentException("Invalid radius value: " + parts[1]);
			
			double radius = Double.parseDouble(rad);
			return new Circle(radius);
		} 
		if (parts[0].equalsIgnoreCase("rectangle") && parts[2].startsWith("length=") && parts[1].startsWith("width=") && parts.length == 3){
			String wid = parts[1].replaceAll("[^0-9.]", "");
			String len = parts[2].replaceAll("[^0-9.]", "");
			
			if (len.isEmpty() || wid.isEmpty())
				throw new IllegalArgumentException("Invalid width: " + wid + " or length: " + len);            
			double width = Double.parseDouble(wid);
            double length = Double.parseDouble(len);
            return new Rectangle(width, length);
        }
		throw new IllegalArgumentException("Invalid input: " + input);
	}
}
