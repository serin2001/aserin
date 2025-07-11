package te06;

import java.util.*;

public class WordAnalyzer {

	public static void main(String[] args) {
		Map<String, Integer> frequency = new HashMap<>();
		Set<String> uniqueWords = new HashSet<>();
// 		uniqueWords is initially declared as a Set, and then it is incorrectly reassigned to an ArrayList
//		uniqueWords=new ArrayList<>(uniqueWords);
		List<String> words = Arrays.asList("apple", "banana", "pear", "apple", "pear");
		for (String word : words) {
			// Never added a word to uniqueWords 
			uniqueWords.add(word); // Add to unique words set
			if (!frequency.containsKey(word)) {
				frequency.put(word, 1); // Initialize count to 1
			} else {
				frequency.put(word, frequency.get(word) + 1); // Increment count
			}
		}
//	} 	The rest is outside of the main method, which will lead to a compilation error
		
		// Collections.sort() works with List types. Convert the Set to a List before sorting
		// Collections.sort(uniqueWords,Comparator.comparingInt(w->w.length()));
		
		// Convert Set to List for sorting
		List<String> sortedUniqueWords = new ArrayList<>(uniqueWords);
		Collections.sort(sortedUniqueWords, Comparator.comparingInt(w->w.length()));
		
		// Print sortedUniqueWords as a result
		// System.out.println(uniqueWords);		
		System.out.println("Unique words sorted by length: " + sortedUniqueWords);
		// The program does not print the frequency map or the unique words after processing
		System.out.println("Word frequencies: " + frequency);
	}
}