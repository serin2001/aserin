package ex21;

public class Textbook extends Book {
	private String subject;
	public String getSubject() {
		return subject;
	}
	public Textbook(String title, String author, int year, String subject) {
		super(title, author, year);
		this.subject = subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + " Subject: " + this.getSubject();
	}
}
