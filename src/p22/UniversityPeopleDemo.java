package p22;

public class UniversityPeopleDemo {

	public static void main(String[] args) {
		Person p = new Person("Alice", "Anders", 34);
		System.out.println(p.getInfo());

		Student s = new Student("Bob", "Bucher", 22, 456789, 3);
		s.addCourse("Weiterfuehrende Konzepte der Programmierung");
		s.addCourse("Mathematik fuer Studierende der Informatik");
		s.printCourseList();
		System.out.println(s.getInfo());

		PhDStudent phd = new PhDStudent("Charlie", "Clever", 28, 987654, 6, "AI Ethics");
		System.out.println(phd.getInfo());

		// Polymorphic Array
		Person[] people = { p, s, phd };
		printInfoForAll(people);
	}

	public static void printInfoForAll(Person[] people) {
		System.out.println("\nInfo for all persons:");
		for (Person person : people)
			System.out.println(person.getInfo());
	}
}
