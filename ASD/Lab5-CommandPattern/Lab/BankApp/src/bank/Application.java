package bank;

/**
 * Created by Rajiv on 3/25/2017.
 */

import domain.Account;
import domain.AccountEntry;
import domain.Customer;
import service.*;

import java.util.Collection;


public class Application {
	public static void main(String[] args) {
		
		CommandHistory historyList = new CommandHistory();
		IAccountService accountService = new AccountService();
		
		// create 2 accounts;
		accountService.createAccount(187682, "Natie");
		accountService.createAccount(987654, "Catie");
		
		//on account 1;
		DepositCommand depositCommand1 = new DepositCommand(accountService,187682, 600);
		depositCommand1.execute();
		historyList.addCommand(depositCommand1);

		DepositCommand depositCommand2 = new DepositCommand(accountService,187682, 400);
		depositCommand2.execute();
		historyList.addCommand(depositCommand2);

		WithdrawCommand withdrawCommand1 = new WithdrawCommand(accountService,187682, 500);
		withdrawCommand1.execute();
		historyList.addCommand(withdrawCommand1);

		//on account 2;
		DepositCommand depositCommand3 = new DepositCommand(accountService,987654, 44553);
		depositCommand3.execute();
		historyList.addCommand(depositCommand3);

		TransferFundsCommand transferFundsCommand1 = new TransferFundsCommand(accountService,987654, 187682, 140, "invoice 10000");
		transferFundsCommand1.execute();
		historyList.addCommand(transferFundsCommand1);
		
		//undo
		historyList.undo();
		
		// show balances		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Account Number: " + account.getAccountnumber());
			System.out.println("Account owner :  " + customer.getName());
			for (AccountEntry entry : account.getEntryList()) {
				System.out.println("Date : "+entry.getDate().toString() + ", Description : " + entry.getDescription() + ", Amount : " + entry.getAmount());
			}

			System.out.println(  "Current Balance: "+	account.getBalance());
		}
	}

}


