package ex31;

import ex31diff.ExternalAudit;
import ex31diff.CompanyAccount;

public class Hauptklasse {

	public static void main(String[] args) {
		Account account = new Account("Anton", 1000, 1234);
		System.out.println(account.owner);
		System.out.println(account.getBalance());
		System.out.println(account.changePin(1234, 9876));
		AccountManager accountManager = new AccountManager();
		accountManager.accessAccount(account);
		ExternalAudit externalAudit = new ExternalAudit();
		externalAudit.accessAccount(account);
		CompanyAccount companyAccount = new CompanyAccount("Coca-Cola", 100000, 1234);
		companyAccount.accessAccount(companyAccount);
	}

}
