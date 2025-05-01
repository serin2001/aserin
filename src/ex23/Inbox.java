package ex23;

import java.util.ArrayList;

public class Inbox {
	ArrayList<Mail> inbox;// = new ArrayList<>();

	public Inbox() {
		inbox = new ArrayList<>();
	}
	public int countUnread() {
		int c = 0;
			for (int i = 0; i < inbox.size(); i++) {
				if (!inbox.get(i).isRead())
					c++;
			}
		return c;
	}

	public void open(int index) {
		if (index < inbox.size() && index >= 0) {
			inbox.get(index).setRead(true);
			System.out.println(inbox.get(index).isRead() + " | " + inbox.get(index).getSubject() + " | " + inbox.get(index).getSender() + " | "
					+ inbox.get(index).getDatetime());
			System.out.println(inbox.get(index).getMessage());
		}
	}

	public void print() {
			for (int i = 0; i < inbox.size(); i++) {
				System.out.println(inbox.get(i).isRead() + " | " + inbox.get(i).getSubject() + " | " + inbox.get(i).getSender() + " | "
						+ inbox.get(i).getDatetime());
			}
	}
	public void add(Mail m) {
		inbox.add(m);
	}
}
