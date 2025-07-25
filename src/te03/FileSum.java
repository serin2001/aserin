package te03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSum {
	public static void main(String[] args) {
		int sum = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) {
				try {
					sum += Integer.parseInt(line);
				} catch (NumberFormatException e) {
					System.err.println("Error parsing a number: " + e.getMessage());
				}
			}

			System.out.println("Sum: " + sum);
			// removed since the try-with-resources statement automatically handles closing the resource
			// ensure to close the reader if using only try{...} catch (...) {...}
			// reader.close();		
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}
