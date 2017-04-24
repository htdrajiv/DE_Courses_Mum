package dao;

/**
 * Created by Rajiv on 4/23/2017.
 */
import java.util.Collection;
import domain.Account;

public interface IAccountDAO {
    Collection<Account> getAccounts();
    IAccountDAO createAccountDAO();
    void saveAccount(Account account);
    void updateAccount(Account account);
    Account loadAccount(long accountnumber);

}
