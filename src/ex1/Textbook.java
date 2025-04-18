package ex1;

public class Textbook extends Book {
	String subject;
	@Override
	public String getInfo() {
		return super.getInfo() + " Subject: " + subject;
	}
}
