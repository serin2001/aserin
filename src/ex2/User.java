package ex2;

class User {
	String name = "Unknown";

	public String getRole() {
		return "General user";
	}

	public String getName() {
		return this.name;
	}
}

class Librarian extends User {
	String department = "Reference";

	@Override
	public String getRole() {
		return this.name + "Librarian";

	}

	public void work() {
		// do some work
	}
}

