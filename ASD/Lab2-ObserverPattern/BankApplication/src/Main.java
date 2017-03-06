import model.Account;
import model.Customer;
import model.SavingAccount;
import observer.EmailSender;
import observer.Logger;
import observer.SmsSender;
import service.AccountServiceImpl;

public class Main {

    public static void main(String[] arg) {

        Customer c1 = new Customer("Rajiv Neupane");
        Account account = new SavingAccount("Mid-West-One-001254",2200,c1);
        AccountServiceImpl accountService = new AccountServiceImpl();

        SmsSender sms = new SmsSender(accountService.getSubjectAccountServiceImp());
        EmailSender emailSender = new EmailSender(accountService.getSubjectAccountServiceImp());
        Logger logger = new Logger(accountService.getSubjectAccountServiceImp());

        accountService.createAccount(account);
        accountService.deposit(account,1400);
        accountService.withDraw(account, 1000);

    }
}
