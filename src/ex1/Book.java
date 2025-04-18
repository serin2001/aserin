package ex1;

public class Book extends Publication {
	String author;
	@Override
	public String getInfo() {
		return super.getInfo() + ", by " + this.author;
	}

}
