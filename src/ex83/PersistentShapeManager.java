package ex83;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersistentShapeManager {
	/*
	 * Saves all shapes to the file, one per line, using their toString() format. If
	 * the file already exists, it should append new shapes instead of overwriting
	 * it. Uses BufferedWriter and try-with-resources. Handles and logs any
	 * file-related exceptions gracefully.
	 */
	public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
		// Use try-with-resources to ensure the BufferedWriter is closed automatically
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
			for (Shape s : shapes) {
				// System.out.println(s.toString());
				writer.write(s.toString()); // Write the string to the file
				writer.newLine(); // Add a new line after each string
			}
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected error: " + e.getMessage());
		}
	}

	/*
	 * Uses BufferedReader to read lines from the file. Each line represents a
	 * shape. Delegates parsing to ShapeFactory.fromString(). Skips malformed lines,
	 * logs them, and returns only valid Shape objects.
	 */
	public static List<Shape> loadShapesFromFile(String filename) {
		List<Shape> shapes = new ArrayList<>();
		// Use try-with-resources to ensure the BufferedReader is closed automatically
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;

			while ((line = reader.readLine()) != null) {
				shapes.add(ShapeFactory.fromString(line)); // Add valid Shape to the list
			}
		} catch (IOException e) {
			System.err.println("Error reading from file: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println("Error parsing shape: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected error: " + e.getMessage());
		}
		return shapes;
	}

	/*
	 * Clears the contents of the specified file (i.e., truncates it to zero
	 * length), effectively making it empty without deleting the file. This can be
	 * used before saving if overwriting is explicitly desired.
	 */
	static void clearFile(String filename) { // Use try-with-resources to ensure the FileWriter is closed automatically
		try (FileWriter writer = new FileWriter(filename, false)) { // false to overwrite
			// No need to write anything to make the file empty
		} catch (IOException e) {
			System.err.println("Error clearing file: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected error: " + e.getMessage());
		}
	}
}
