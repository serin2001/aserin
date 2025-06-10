package p32;

public class Main {

	public static void main(String[] args) {
		CustomConfiguration config = new CustomConfiguration("name");
		config.modules.add("algebra");
		config.describe();
	}
}
