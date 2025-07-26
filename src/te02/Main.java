package te02;

public class Main {
    public static void main(String[] args) {
        Dozent dozent = new Dozent();
        Student studi = new Student();
        Tutor tutor = new Tutor();
        Student s2 = tutor;
        // gehalt is declared as private. It can only be accessed within the Dozent class itself. Need a public getter method in the Dozent class
//        System.out.println(dozent.gehalt);
        // matNummer ist public in der Klasse Student, studi ist eine Instanz von Student und kann auf matNummer zugreifen
        System.out.println(studi.matNummer);
        // uniWitze ist Instanzvariable von Student und nicht statisch. Main kann nicht direkt darauf zugreifen. Fuer den Zugriff muss man studi.uniWitze verwenden
//        System.out.println(uniWitze);
        // trinktAlkohol ist protected static Variable in der Klasse Student. Fuer den Zugriff muss man Student.trinktAlkohol verwenden
//        System.out.println(trinktAlkohol);
		// will not compile because s2 is declared as Student, and Student does not have printInfo(), getGehalt() methods
//        s2.printInfo();
//        s2.getGehalt();
    }
}
