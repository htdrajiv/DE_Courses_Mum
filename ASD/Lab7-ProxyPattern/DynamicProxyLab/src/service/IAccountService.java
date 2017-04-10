package service;

/**
 * Created by Rajiv on 4/6/2017.
 */
import domain.Account;

import java.util.Collection;

public interface IAccountService {
    Account createAccount(long accountNumber, String customerName);

    Collection<Account> getAllAccounts();

    Account getAccount(long accountNumber);

    void deposit(long accountNumber, double amount);

    void withdraw(long accountNumber, double amount);

    void transferFunds(long fromAccountNumber, long toAccountNumber,
                       double amount, String description);
}
