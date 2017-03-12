package strategy;

import model.Account;

/**
 * Created by Rajiv on 3/10/2017.
 */
public interface AccountInterest {
    Double interest(Account account);
}

