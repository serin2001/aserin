package ex23;

public class Mailbox {

	public static void main(String[] args) {
		Mail m1 = new Mail("Absender1", "Thema1", "Nachricht1");
		Mail m2 = new Mail("Absender2", "Thema2", "Nachricht2");
		Mail m3 = new Mail("Absender3", "Thema3", "Nachricht3");
		Mail m4 = new Mail("Absender4", "Thema4", "Nachricht4");
		Mail m5 = new Mail("Absender5", "Thema5", "Nachricht5");
		Inbox inbox = new Inbox();

		inbox.add(m1);inbox.add(m2);inbox.add(m3);inbox.add(m4);inbox.add(m5);
		//m1.markAsRead(m1);
		m4.markAsRead(m4);
		m5.markAsRead(m5);
		
		inbox.open(0);
		System.out.println("Ungelese Mails: " + inbox.countUnread());
		
		inbox.print();
		//Call m1.print()
		System.out.println(m1.print());

	}

}
