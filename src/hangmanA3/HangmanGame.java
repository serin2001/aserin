package hangmanA3;

public class HangmanGame extends GameGUI implements TimerLogic, GameLogic {

	protected Thread timerThread;

	public void handleGuess(char guess) {
		if (guessedLetters.contains(guess)) {
			System.out.println("Letter was already guessed.");
			return;
		}
		guessedLetters.add(guess);
		if (!currentWord.contains(String.valueOf(guess))) {
			attemptsLeft--;
		}
		updateDisplay();
		if (hasWon()) {
			endGame(true);
		} else if (attemptsLeft <= 0) {
			endGame(false);
		}
	}

	public boolean hasWon() {
		for (char c : currentWord.toCharArray()) {
			if (!guessedLetters.contains(c))
				return false;
		}
		return true;
	}

	public void endGame(boolean won) {
		if (won == true) {
			System.out.println("Gewonnen! Das Wort war: " + currentWord);
		} else {
			System.out.println("Verloren! Das Wort war: " + currentWord);
		}
		inputField.setEnabled(false);
		System.exit(0);
	}

	public void startTimer() {
		TimerRunnable timerRunnable = new TimerRunnable(this);
        timerThread = new Thread(timerRunnable);
		timerThread.start();
	}
}
