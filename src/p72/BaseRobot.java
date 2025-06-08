package p72;

public abstract class BaseRobot implements ControllableRobot {
	protected String name;
	protected boolean running;

	public BaseRobot(String name) {
		this.name = name;
	}
	@Override
	public void start() {
		this.running = true;
		System.out.println(name + " started.");
	}
	@Override
	public void stop() {
		this.running = false;
		System.out.println(name + " stopped.");
	}
	@Override
	public boolean isRunning() {
		return this.running;
	}
	@Override
	public abstract void performTask();
}
