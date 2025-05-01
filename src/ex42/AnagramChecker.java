package ex42;

import java.util.Scanner;

public class AnagramChecker {
	/**
	 * Returns true if the two strings are anagrams of each other.
	 */
	public static boolean isAnagram(String a, String b) {
		// Wenn die Längen unterschiedlich sind, können es keine Anagramme sein
		if (a.length() != b.length()) {
			return false;
		}

		// Buchstaben zählen für beide Wörter
		int[] zahlenA = countLetters(a);
		int[] zahlenB = countLetters(b);

		// Vergleichen ob die Buchstabenzahlen gleich sind
		for (int i = 0; i < 26; i++) {
			if (zahlenA[i] != zahlenB[i]) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Helper method to count how many times each letter (a-z) appears .
	 */
	public static int[] countLetters(String s) {
		int[] zahlen = new int[26]; // Für jeden Buchstaben ein Platz (a=0, b=1, ..., z=25)

		for (char c : s.toCharArray()) {
			// Nur Buchstaben zählen
			if (c >= 'a' && c <= 'z') {
				zahlen[c - 'a']++; // Erhöht den Zähler für diesen Buchstaben
			}
		}

		return zahlen;
	}

	/**
	 * Gibt die Buchstabenzählung schön formatiert aus
	 */
	public static void printLetterCounts(String s) {
		int[] zahlen = countLetters(s);

		System.out.println("Buchstabenzählung für '" + s + "':");
		for (int i = 0; i < 26; i++) {
			if (zahlen[i] > 0) {
				// Buchstabe berechnen (0 -> 'a', 1 -> 'b', etc.)
				char buchstabe = (char) ('a' + i);
				System.out.println(buchstabe + ": " + zahlen[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Get two strings from the user
		System.out.print(" Enter the first string: ");
		String word1 = scanner.nextLine();
		System.out.print(" Enter the second string: ");
		String word2 = scanner.nextLine();
		// TODO: Process the strings here (ignore spaces , case)
		word1 = word1.replaceAll("\\s", "").toLowerCase();
		word2 = word2.replaceAll("\\s", "").toLowerCase();
		System.out.println(" Are they anagrams ? " + isAnagram(word1, word2));
		printLetterCounts(word1);
		printLetterCounts(word2);
	}
}
