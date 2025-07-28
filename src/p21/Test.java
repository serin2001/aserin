package p21;

class Course {
	public String getName() {
		return "General course";
	}
}

class LabCourse extends Course {
	public String getName() {
		return "Lab course";
	}
}

public class Test {
	public static void main(String[] args) {
		Course c = new LabCourse();
		System.out.println(c.getName());
	}
}
