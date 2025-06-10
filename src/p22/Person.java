package p22;

public class Person {
	protected String firstName, lastName;
	protected int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getInfo() {
		return firstName + " " + lastName + ", age " + age;
	}
}
