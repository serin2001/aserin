package ex21;

public class Book extends Publication {
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + ", by " + this.getAuthor();
	}
	public Book(String title, String author, int year) {
		super(title, year);
		this.author = author;
	}

}
