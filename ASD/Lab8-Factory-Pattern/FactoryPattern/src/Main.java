import dao.AccountDAO;
import dao.AccountDAOFactory;
import dao.MockAccountDAO;
import domain.Account;
import domain.AccountEntry;
import domain.Customer;
import service.AccountService;
import service.IAccountService;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        AccountDAOFactory.registerAccountDAO("production", new AccountDAO());
        AccountDAOFactory.registerAccountDAO("test", new MockAccountDAO());

        IAccountService accountService = new AccountService("production");

        // creating 2 accounts;
        accountService.createAccount(444222, "KObi");
        accountService.createAccount(122224, "Heann");

        // deposit and withdraw on account 1;
        accountService.deposit(444222, 240);
        accountService.deposit(444222, 529);
        accountService.withdraw(444222, 230);

        //// deposit and transfer on account 2;
        accountService.deposit(122224, 12450);
        accountService.transferFunds(444222, 122224,  200, "Transfer Completed...");


        // showing balances

        Collection<Account> accountlist = accountService.getAllAccounts();
        Customer customer = null;
        for (Account account : accountlist) {
            customer = account.getCustomer();
            System.out.println("Statement for Account: "+ account.getAccountnumber());
            System.out.println("Account Holder: " + customer.getName());
            System.out.println("Date............................."+ "Description............."+ "Amount...............");
            for (AccountEntry entry : account.getEntryList()) {
                System.out.println(entry.getDate()+"   " + entry.getDescription() +"      amount: "+ entry.getAmount());
            }

            System.out.println("Current Balance:"+ account.getBalance());
        }
    }
}
