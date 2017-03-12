package service;


import dao.AccountDao;
import dao.AccountDaoImp;
import model.Account;
import model.AccountEntry;

import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class AccountServiceImpl implements AccountService {
    AccountDao accountDao;
    public AccountServiceImpl(){
        accountDao= new AccountDaoImp();
    }

    @Override
    public void createAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance()+amount);
        accountDao.updateAccount(account);
    }

    @Override
    public void withDraw(Account account, double amount) {
        account.setBalance(account.getBalance()-amount);
        account.getAccountEntryList().add(new AccountEntry());
        accountDao.updateAccount(account);
    }

    @Override
    public void  transferFunds(Account oldAccount, Account newAccount, double amount) { }

    @Override
    public Account getAccount(String accountNumber) {
        return accountDao.loadAccount(accountNumber) ;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountDao.getAccounts();
    }

    @Override
    public void addInterest(){
        for(Account account: getAllAccount()){
            account.setBalance(account.getBalance() + account.getAccountInterest().interest(account));
        }
    }
}