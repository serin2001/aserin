package p11;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		int numberToGuess = (int) (Math.random() * 20) + 1;
		Scanner scanner = new Scanner(System.in);
		int guess;
		int attempts = 0;
		boolean won = false;

		while (attempts < 5) {
			System.out.println("Your guess (1-20): ");
			guess = scanner.nextInt();
			attempts++;
			if (guess == numberToGuess) {
				System.out.println("Correct! You guessed it in " + attempts + " attempts.");
				won = true;
				break;
			} else if (guess < numberToGuess) {
				System.out.println("Too low");
			} else {
				System.out.println("Too high");
			}
		}
		if (!won)
			System.out.println("You lost. The number was: " + numberToGuess);
		// Close scanner
		scanner.close();
	}
}