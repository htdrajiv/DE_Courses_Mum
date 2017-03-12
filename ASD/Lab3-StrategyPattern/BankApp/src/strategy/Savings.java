package strategy;

import model.Account;

/**
 * Created by Rajiv on 3/10/2017.
 */
public class Savings implements AccountInterest {
    @Override
    public Double interest(Account account) {
        System.out.println("Applying savings interest on account "+account.getAccountNumber());
        Double interest = 0.0;
        if (account.getBalance() <= 1000) {
            interest = account.getBalance() * 0.01;
        } else if (account.getBalance() > 1000 && account.getBalance() <= 5000) {
            interest = account.getBalance() * 0.02;
        } else if (account.getBalance() > 5000) {
            interest = account.getBalance() * 0.04;
        }
        return interest;
    }
}
