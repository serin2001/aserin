package ex23;

import java.time.LocalDateTime;

public class Mail {
	private String sender;
	private String subject;
	private String message;
	private boolean read;
	private LocalDateTime datetime;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public Mail(String sender, String subject, String message) {
		this.sender = sender;
		this.subject = subject;
		this.message = message;
		this.read = false;
		this.datetime = LocalDateTime.now();
	}

	public void markAsRead(Mail m) {
		m.setRead(true);
	}

public String print(Mail m) {
	return m.getSubject() + " from " + m.getSender() + " on " + m.getDatetime() + ": " + m.getMessage();
}
}
