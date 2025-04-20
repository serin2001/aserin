package ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mail {
	String sender;
	String subject;
	String message;
	boolean read;
	LocalDateTime datetime;

	public Mail(String sender, String subject, String message) {
		this.sender = sender;
		this.subject = subject;
		this.message = message;
		this.read = false;
		this.datetime = LocalDateTime.now();
	}

	public void markAsRead(Mail m) {
		m.read = true;
	}

public String print(Mail m) {
	
	return m.subject + " from " m.sender + " on " + m.datetime + ": " + m.message;
}
}
