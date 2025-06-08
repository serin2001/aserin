package p71;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordFinder {
	public String chooseRandomWordFromFile(int length) throws IOException {
		List<String> words = new ArrayList<>();
		File file = new File("src/p71/words.txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
					if (line.length() == length)
						words.add(line.trim()); // Add a valid word to the list
			}
		} 
		if (words.isEmpty())
			return null;
		else {
			int index = new Random().nextInt(words.size());
			String word = words.get(index);
			List<String> allWords = new ArrayList<>();
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = reader.readLine()) != null) {
						if(!line.trim().equals(word))
							allWords.add(line); // Add a valid word to the list
				}
			} 
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
				for (String s : allWords) {
					writer.write(s.toString()); // Write the string to the file
					writer.newLine(); // Add a new line after each string
				}
			} 
			return word;
		}
	}
	
	public static void main(String[] args) {
		WordFinder finder = new WordFinder();
		try {
			String word = finder.chooseRandomWordFromFile(6);
			if(word != null) {
				System.out.println("Chosen word: " + word);
			} else {
				System.out.println("No word with the desired length found.");
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
	}
}