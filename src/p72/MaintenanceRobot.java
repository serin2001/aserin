package p72;

public class MaintenanceRobot extends BaseRobot {
	public MaintenanceRobot(String name) {
		super(name);
	}

	@Override
	public void performTask() {
		if (!running)
			return;
		System.out.println(name + " is performing maintenance.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(name + " was interrupted.");
		}
	}
}
