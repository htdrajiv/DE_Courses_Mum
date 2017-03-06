package dao;

import model.Account;

import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */
public interface AccountDao {

    public void saveAccount(Account account);

    public void updateAccount(Account account);

    public Account loadAccount(String accountNumber);

    public List<Account> getAccounts();

}