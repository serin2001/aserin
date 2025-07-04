package ex91;

public class CoursePhaseTest {
	public enum CoursePhase {
		NOT_STARTED("Course not started yet"), ONGOING("Course is in progress"), FINISHED("Course has ended");

		private final String message;

		CoursePhase(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

	public static void main(String[] args) {
		for (CoursePhase p : CoursePhase.values()) {
			System.out.println("Phase: " + p + " - " + p.getMessage());
		}
	}
}
