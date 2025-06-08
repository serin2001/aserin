package p72;

public class RobotControlCenter {

	public static void main(String[] args) {
		TransportRobot robot = new TransportRobot("Transport-1");
		robot.start();
		robot.performTask();
		robot.stop();
		System.out.println(robot.name + " is running: " + robot.isRunning());
	}

}
