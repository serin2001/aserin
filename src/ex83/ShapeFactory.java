package ex83;

public class ShapeFactory {
	public static Shape fromString(String input) {
		if (input.contains("Circle:") && input.contains("radius=")){
			double radius = Double.parseDouble(input.substring(input.indexOf("radius=") + 7));
			return new Circle(radius);
		} else if (input.contains("Rectangle:") && input.contains("width=") && input.contains("length=")) {
			int widthStartIndex = input.indexOf("width=") + 6; // 6 is the length of "width="
            int widthEndIndex = input.indexOf(',', widthStartIndex); // Find the next ',' after width
            double width;
            if (widthStartIndex < widthEndIndex) { // Ensure that the start index is before the end index
                String widthString = input.substring(widthStartIndex, widthEndIndex);
                width = Double.parseDouble(widthString);
            } else {
                throw new IllegalArgumentException("Invalid input format for width");
            }

            int lengthStartIndex = input.indexOf("length=") + 7; // 7 is the length of "length="
            String lengthString = input.substring(lengthStartIndex); // Get the rest of the string
            double length = Double.parseDouble(lengthString);
            return new Rectangle(width, length);
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
	}
}
