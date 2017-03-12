import model.Account;
import model.CheckingsAccount;
import model.Customer;
import model.SavingsAccount;
import service.AccountServiceImpl;
import strategy.Checkings;
import strategy.Savings;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Rajiv Neupane");
        AccountServiceImpl accountService = new AccountServiceImpl();

        Account checkingsAccount = new CheckingsAccount("1254",Double.parseDouble("2500"),customer, new Checkings());
        accountService.createAccount(checkingsAccount);
        Account savingsAccount = new SavingsAccount("1452",Double.parseDouble("4000"),customer,new Savings());
        accountService.createAccount(savingsAccount);

        accountService.deposit(checkingsAccount, 1400);
        accountService.withDraw(checkingsAccount, 1000);
        accountService.deposit(savingsAccount,400);

        accountService.addInterest();
        System.out.println("Savings Account balance after adding interest : "+accountService.getAccount("1452").getBalance());
        System.out.println("Checkings Account balance after adding interest : "+accountService.getAccount("1254").getBalance());
    }
}
