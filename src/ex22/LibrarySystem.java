package ex22;

public class LibrarySystem {
	public static void main(String[] args) {
		User u1 = new User();
		Librarian l1 = new Librarian();
		User u2 = l1;
		System.out.println(u1.getRole());
		System.out.println(l1.getRole());
		System.out.println(u2.getRole());
		System.out.println(l1.getName());
		System.out.println(u1.getName());
		l1.work();
		//u2.work();
		/* Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The method work() is undefined for the type User
		 */
        // Safe casting to call work() method
        if (u2 instanceof Librarian) {
            ((Librarian) u2).work();
        }
	}
}
