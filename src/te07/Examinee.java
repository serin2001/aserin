package te07;

public interface Gradable {
    double getGrade();
    boolean isPassed();
}

public class Examinee implements Comparable<Examinee>, Gradable {
	// final name, grade, passed can only be set during the construction of an Examinee object. After that, their values cannot be changed.
	private final String name;
	private final double grade;
	private final boolean passed;

	public Examinee(String name, double grade) {
		this.name = name;
		this.grade = grade;
		this.passed = this.grade <= 4;
	}

	@Override	// int compareTo(object o) ist ein Element des Comparable-Interfaces: 
	//	-1: this Objekt "kleiner" als das uebergebene Objekt o
	//	0: die beiden Objekte gleich
	// 	1: this Objekt "groesser" als das uebergebene Objekt o
	public int compareTo(Examinee o) {
		return Double.compare(this.getGrade(), o.getGrade());
	}

	@Override
	public double getGrade() {
		return grade;
	}

	@Override
	public boolean isPassed() {
		return passed;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.getName() + " has grade " + this.getGrade();
	}
}
/* Wird in diesem Code eines der SOLID Prinzipien verletzt?
 * Open/Closed Principle (OCP) wird verletzt, da die Vergleichslogik fest in der Klasse verankert ist. 
 * Dadurch ist Examinee nicht gut erweiterbar und erfordert Aenderungen an der Klasse
 */
