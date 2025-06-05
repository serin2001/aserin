package hangman;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			//new Game();	// A1
			new Timer();	// A2
		});
	}
}
