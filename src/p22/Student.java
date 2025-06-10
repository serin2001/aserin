package p22;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {
	protected List<String> courses;
	protected int matNumber, semester;

	public Student(String firstName, String lastName, int age, int matNumber, int semester) {
		super(firstName, lastName, age);
		this.matNumber = matNumber;
		this.semester = semester;
		this.courses = new ArrayList<>();
	}
	
	public void addCourse(String course) {
		courses.add(course);
	}

	public void printCourseList() {
		System.out.println("Courses of " + firstName + ":");
		for (String course : courses)
			System.out.println(" - " + course);
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + ", MatNo: " + matNumber + ", Semester: " + semester;
	}
}
