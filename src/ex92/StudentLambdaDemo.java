package ex92;

public class StudentLambdaDemo {
	static class Student {
		String name;
		int year;
		String major;

		Student(String name, int year, String major) {
			this.name = name;
			this.year = year;
			this.major = major;
		}
	}

	interface StudentFormatter {
		String format(Student s);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Mike", 2, "Psychology");
		Student s2 = new Student("Rene", 3, "Computer Science");

		StudentFormatter shortF = s -> "Student " + s.name + ", Jahr " + s.year;
		StudentFormatter longF = s -> s.name + " studiert " + s.major + " im " + s.year + ". Jahr";

		System.out.println(shortF.format(s1));
		System.out.println(longF.format(s1));

		System.out.println(shortF.format(s2));
		System.out.println(longF.format(s2));
	}
}