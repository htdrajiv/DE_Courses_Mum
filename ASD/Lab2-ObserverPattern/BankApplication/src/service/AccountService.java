package service;

import model.Account;

import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */
public interface AccountService {

    public void createAccount(Account account);

    public void deposit(Account account, double amount);

    public void withDraw(Account account, double amount);

    public void  transferFunds(Account oldAccount, Account newAccount, double amount);

    public Account getAccount(String accountNumber);

    public List<Account> getAllAccount();

}