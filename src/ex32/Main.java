package ex32;

public class Main {

	public static void main(String[] args) {
		Message m1 = new Email();
		Message m2 = new SMS();
		System.out.println(m1.getType());
		System.out.println(m2.getType());
		if (m1 instanceof Email) {
			((Email) m1).send(); // Uncomment this line and explain what happens
		}
		/*
		 * What is the static type of m1? Message What is its dynamic type? Email Which
		 * method is called? Why? Es wird Methode aus Message aufgerufen, weil der
		 * Compiler zudem Zeitpunkt denkt, dass m1 eine Instanz von Message ist Why
		 * can’t send() be called directly? Message hat keine Methode send() How could
		 * you safely call send() anyway (e.g. instanceof)? Wir müssen casting machen
		 */
	}

}
