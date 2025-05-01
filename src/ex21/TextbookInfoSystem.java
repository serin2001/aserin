package ex21;

public class TextbookInfoSystem {

	public static void main(String[] args) {
		Textbook book = new Textbook("Jane Doe", "Data Structures", 2020, "Computer Science");
		System.out.println(book.getInfo());
	}

}
