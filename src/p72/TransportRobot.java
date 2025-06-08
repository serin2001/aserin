package p72;

public class TransportRobot extends BaseRobot {
	public TransportRobot(String name) {
		super(name);
	}

	@Override
	public void performTask() {
		if (!running)
			return;
		for (int i = 0; i < 3; i++) {
			System.out.println(name + " is transporting packages.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(name + " was interrupted.");
			}
		}
	}
}
