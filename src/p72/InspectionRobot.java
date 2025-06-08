package p72;

public class InspectionRobot extends BaseRobot {
	public InspectionRobot(String name) {
		super(name);
	}

	@Override
	public void performTask() {
		if (!running)
			return;
		for (int i = 0; i < 2; i++) {
			System.out.println(name + " is inspecting shelves.");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(name + " was interrupted.");
			}
		}
	}
}