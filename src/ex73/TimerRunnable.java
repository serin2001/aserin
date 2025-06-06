package ex73;

import javax.swing.SwingUtilities;

public class TimerRunnable implements Runnable {
    private final HangmanGame game;

    public TimerRunnable(HangmanGame game) {
        this.game = game;
    }

    @Override
    public void run() {
		while (game.timeLeft > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			game.timeLeft--;
			SwingUtilities.invokeLater(() -> game.timeLabel.setText("Time left: " + game.timeLeft));

			if (game.timeLeft <= 0) {
				System.out.println("Time is over");
				SwingUtilities.invokeLater(() -> game.endGame(false));
			}
		}
	}
}