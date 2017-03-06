
package model;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class CheckingAccountInterest implements Interest {
    @Override
    public Double calculateInterest(Account account) {
        if (account.getBalance() < 1000) {
            return account.getBalance() * 1.5 / 100;
        } else if (account.getBalance() > 1000) {
            return account.getBalance() * 2.5 / 100;
        }
        return 0.0;
    }
}