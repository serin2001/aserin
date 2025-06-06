package ex72;

public class Timer extends Game {
	protected Thread timerThread;
	protected boolean timerRunning;

	@Override
	protected void startGame() {
		super.startGame();
		startTimer();
	}

	public void startTimer() {
		timerRunning = true;
		timerThread = new Thread(new TimerRunnable(this));
		timerThread.start();
	}
}
