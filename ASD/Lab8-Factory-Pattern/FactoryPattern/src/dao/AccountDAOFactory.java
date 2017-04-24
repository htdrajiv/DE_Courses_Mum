package dao;

/**
 * Created by Rajiv on 4/23/2017.
 */
import java.util.HashMap;

public class AccountDAOFactory {
    private static HashMap<String, IAccountDAO> registeredAccountDAO = new HashMap<String, IAccountDAO>();

    public static void registerAccountDAO(String accountDAOID, IAccountDAO accountDAO) {
        registeredAccountDAO.put(accountDAOID, accountDAO);
    }

    public static IAccountDAO createAccountDAO(String accountDAOID) {
        IAccountDAO accountDAO = registeredAccountDAO.get(accountDAOID);
        return accountDAO.createAccountDAO();
    }
}
