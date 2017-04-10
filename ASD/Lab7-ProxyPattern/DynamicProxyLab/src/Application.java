/**
 * Created by Rajiv on 4/6/2017.
 */ import domain.Account;
import domain.AccountEntry;
import domain.Customer;
import proxies.TimerProxy;
import service.AccountService;
import service.IAccountService;

import java.util.Collection;


public class Application {
    public static void main(String[] args) {
        IAccountService accountService = (AccountService) TimerProxy.newInstance(new AccountService());
        // create 2 accounts;
        accountService.createAccount(6767888, "Charlie Charlston");
        accountService.createAccount(5656444, "Jhonny Cash");
        //Use account 1;
        accountService.deposit(6767888, 245);
        accountService.deposit(6767888, 678);
        accountService.withdraw(6767888, 230);
        //Use account 2;
        accountService.deposit(5656444, 12450);
        accountService.transferFunds(5656444, 6767888, 100, "payment of invoice 10009");
        // Display balances
        Collection<Account> accountlist = accountService.getAllAccounts();
        Customer customer ;
        for (Account account : accountlist) {
            customer = account.getCustomer();
            System.out.println("Statement for Account: " + account.getAccountnumber());
            System.out.println("Account Holder: " + customer.getName());
            System.out.println("-Date-------------------------"
                    + "-Description------------------"
                    + "-Amount-------------");
            for (AccountEntry entry : account.getEntryList()) {
                System.out.printf("%30s%30s%20.2f\n", entry.getDate()
                        .toString(), entry.getDescription(), entry.getAmount());
            }
            System.out.println("----------------------------------------"
                    + "----------------------------------------");
            System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
                    account.getBalance());
        }
    }

}


