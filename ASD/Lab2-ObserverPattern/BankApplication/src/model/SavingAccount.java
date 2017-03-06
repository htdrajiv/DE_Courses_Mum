package model;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class SavingAccount extends Account {

    public SavingAccount(String accountNumber, double balance, Customer customer) {
        super(accountNumber,balance,customer);
    }

    public SavingAccount(){
        setInterest(new SavingAccountInterest());
    }
}