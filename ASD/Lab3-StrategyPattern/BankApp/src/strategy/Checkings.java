package strategy;

import model.Account;

/**
 * Created by Rajiv on 3/10/2017.
 */
public class Checkings implements AccountInterest {
    @Override
    public Double interest(Account account) {
        Double interest = 0.0;
        System.out.println("Applying checkings interest on account "+account.getAccountNumber());
        if (account.getBalance() < 1000) {
            interest = account.getBalance() * 1.5 / 100;
        } else if (account.getBalance() > 1000) {
            interest = account.getBalance() * 2.5 / 100;
        }
        return interest;
    }
}
