package dao;

import model.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class AccountDaoImp implements AccountDao {
    // in memory kind of arraylist
    List<Account> accounts = new ArrayList();

    @Override
    public void saveAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void updateAccount(Account account) {
    }

    @Override
    public Account loadAccount(String accountNumber) {
        for(Account account : accounts){
            if(account.getAccountNumber().equals(accountNumber))
                return account;
        }
        return  null;
    }

    @Override
    public List<Account> getAccounts() {
        return accounts;
    }

}