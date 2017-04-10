package dao;

/**
 * Created by Rajiv on 4/6/2017.
 */
import domain.Account;

import java.rmi.Remote;
import java.util.Collection;

public interface IAccountDAO extends Remote {
    void saveAccount(Account account);
    void updateAccount(Account account);
    Account loadAccount(long accountnumber);
    Collection<Account> getAccounts();
}
