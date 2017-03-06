package dao;

import model.Account;

import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class AccountDaoImp implements AccountDao {

    @Override
    public void saveAccount(Account account) {
        System.out.println(account);
    }

    @Override
    public void updateAccount(Account account) {
    }

    @Override
    public Account loadAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

}