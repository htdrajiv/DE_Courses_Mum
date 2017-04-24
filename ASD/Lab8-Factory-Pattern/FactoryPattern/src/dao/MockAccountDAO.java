package dao;

/**
 * Created by Rajiv on 4/23/2017.
 */

import java.util.*;
import domain.Account;

public class MockAccountDAO implements IAccountDAO {
    Collection<Account> accountlist = new ArrayList<Account>();

    public MockAccountDAO createAccountDAO() {
        return new MockAccountDAO();
    }

    public void saveAccount(Account account) {
        accountlist.add(account);
    }

    public void updateAccount(Account account) {
        Account accountexist = loadAccount(account.getAccountnumber());
        if (accountexist != null) {
            accountlist.remove(accountexist);
            accountlist.add(account);
        }

    }

    public Account loadAccount(long accountnumber) {
        for (Account account : accountlist) {
            if (account.getAccountnumber() == accountnumber) {
                return account;
            }
        }
        return null;
    }

    public Collection<Account> getAccounts() {
        return accountlist;
    }

}
