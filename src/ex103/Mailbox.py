class Mail:
	
	def __init__(self, sender, subject, message, date):
		self.sender = sender
		self.subject = subject
		self.message = message
		self.date = date
		self.read = False

	def mark_as_read(self):
		self.read = True
		
	def get_header(self):
		status = "READ" if self.read else "UNREAD"
		return f"{status} | {self.subject} | {self.sender} | {self.date}"
		
	def formatted(self):
		return self.subject + " from " + self.sender + " on " + self.date + ": " + self.message

class Inbox:
	def __init__(self):
		self.mails = [] # Liste mit Mails
	
	def add_mail(self, mail: Mail):
		self.mails.append(mail)
		
	def print_headers(self):
		for i, mail in enumerate(self.mails):
			status = "Read" if mail.read else "Unread"
			print(str(i) + ": " + mail.get_header())
			
	def open(self, index):
		if index < 0 or index >= len(self.mails):
			print("Invalid index. No such e-mail.")
			return
		mail = self.mails[index]
		mail.mark_as_read()
		print(mail.formatted())
	
	def count_unread(self):
		return sum(1 for mail in self.mails if not mail.read)
		
if __name__ == "__main__":
	inbox = Inbox()
	inbox.add_mail(Mail("anisa@icloud.com", "Meeting", "Let's meet at 10 AM tomorrow.", "10-05-2025 10:10"))
	inbox.add_mail(Mail("tom@outlook.de", "Project Update", "Project is due Monday!", "15-06-2025 09:30"))
	
	print("Inbox headers:")
	inbox.print_headers()
	print() # Empty line
	
	print("Unread emails: ", inbox.count_unread())
	print() # Empty line
	
	print("Opening email at index 1:")
	inbox.open(1)
	
	print() # Empty line	
	print("Unread emails after opening one: ", inbox.count_unread())
	