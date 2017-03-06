package model;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class SavingAccountInterest implements Interest {

    @Override
    public Double calculateInterest(Account account) {

        if (account.getBalance() <= 1000) {
            return account.getBalance() * 0.01;
        } else if (account.getBalance() > 1000 && account.getBalance() <= 5000) {
            return account.getBalance() * 0.02;
        } else if (account.getBalance() > 5000) {
            return account.getBalance() * 0.04;
        }
        return 0.0;
    }

}