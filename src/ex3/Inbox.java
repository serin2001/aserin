package ex3;

import java.util.ArrayList;

public class Inbox {
	ArrayList<Mail> inbox;// = new ArrayList<>();

	public Inbox() {
		inbox = new ArrayList<>();
	}
	public int countUnread() {
		int c = 0;
		if (inbox != null) {
			for (int i = 0; i < inbox.size(); i++) {
				if (!inbox.get(i).read)
					c++;
			}
		}
		return c;
	}

	public void open(int index) {
		if (index < inbox.size()) {
			inbox.get(index).read = true;
			System.out.println(inbox.get(index).read + " | " + inbox.get(index).subject + " | " + inbox.get(index).sender + " | "
					+ inbox.get(index).datetime);
			System.out.println(inbox.get(index).message);
		}
	}

	public void print() {
		if (inbox != null) {
			for (int i = 0; i < inbox.size(); i++) {
				System.out.println(
						inbox.get(i).read + " | " + inbox.get(i).subject + " | " + inbox.get(i).sender + " | " + inbox.get(i).datetime);
			}
		}
	}
	public void add(Mail m) {
		inbox.add(m);
	}
}
