package p12;

import java.util.Scanner;

public class SnakeLanguage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word to translate: ");
		String input = scanner.nextLine();
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			result.append(c);
			if ("aeiouAEIOU".contains(String.valueOf(c))) {
				result.append('s').append(c);
			}
		}
		System.out.println("Snake language: " + result);
	}
}
