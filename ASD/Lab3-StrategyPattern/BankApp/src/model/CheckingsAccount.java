package model;

import strategy.AccountInterest;

/**
 * Created by Rajiv on 3/11/2017.
 */
public class CheckingsAccount extends Account {
    public CheckingsAccount(String accountNo, Double balance, Customer customer, AccountInterest interest){
        super(accountNo,balance,customer,interest);
    }
}
