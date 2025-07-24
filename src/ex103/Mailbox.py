from datetime import datetime

class Mail:	
	def __init__(self, sender, subject, message, date=None):
		self.sender = sender
		self.subject = subject
		self.message = message
		self.datetime = date if date else datetime.now()
		self.read = False

	def mark_as_read(self):
		self.read = True
		
	def get_header(self):
		status = "READ" if self.read else "UNREAD"
		return f"{status} | {self.subject} | {self.sender} | {self.datetime.strftime('%Y-%m-%d %H:%M')}" 
		
	def print_mail(self):
		print(f"{self.subject} from {self.sender} on {self.datetime.strftime('%Y-%m-%d %H:%M')}: {self.message}")

class Inbox:
	def __init__(self):
		self.mails = [] # Liste mit Mails
	
	def add_mail(self, mail: Mail):
		self.mails.append(mail)
		
	def print_headers(self):
		if not self.mails:
			print("Inbox is empty.")
			return
		for i, mail in enumerate(self.mails):
#			status = "Read" if mail.read else "Unread"
			print(f"{i}: {mail.get_header()}")
			
	def open(self, index):
		if 0 <= index < len(self.mails):
			mail = self.mails[index]
			mail.mark_as_read()
			mail.print_mail()
		else:
			print("Invalid index. No such e-mail.")
	
	def count_unread(self):
		return sum(not mail.read for mail in self.mails)
		
if __name__ == "__main__":
	inbox = Inbox()
	inbox.add_mail(Mail("anisa@icloud.com", "Meeting", "Let's meet at 10 AM tomorrow."))
	inbox.add_mail(Mail("tom@outlook.de", "Project Update", "Project is due Monday!"))
	
	print("Inbox headers:")
	inbox.print_headers()
	print() # Empty line
	
	print("Unread emails: ", inbox.count_unread())
	print() # Empty line
	
	print("Opening email at index 1:")
	inbox.open(1)
	
	print() # Empty line	
	print("Unread emails after opening one: ", inbox.count_unread())
	