package ex1;

public class TextbookInfoSystem {

	public static void main(String[] args) {
		Textbook book = new Textbook();
		book.author = "Jane Doe";
		book.title = "Data Structures";
		book.subject = "Computer Science";
		book.year = 2020;
		System.out.println(book.getInfo());
	}

}
