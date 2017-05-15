package bank.dao;

import java.util.ArrayList;
import java.util.Collection;

import bank.domain.Account;

public class TestAccountDAO implements IAccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new
		System.out.println("saveAccount()");
	}

	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountnumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
			System.out.println("updateAccount()");
		}

	}

	public Account loadAccount(long accountnumber) {
		System.out.println("loadAccount()");
		for (Account account : accountlist) {
			if (account.getAccountnumber() == accountnumber) {
				return account;
				
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		System.out.println("getAccounts()");
		return accountlist;
	}


}
