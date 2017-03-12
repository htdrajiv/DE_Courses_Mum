

package model;

import strategy.AccountInterest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class Account {
    public Account(){}
    private AccountInterest accountInterest;
    private String accountNumber;
    private Double balance;
    private List<AccountEntry> accountEntryList = new ArrayList<>();
    private Customer customer;

    public Account(String accountNumber, double balance,Customer customer,AccountInterest interest) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.accountInterest = interest;
    }

    public void setAccountInterest(AccountInterest accountInterest){
        this.accountInterest = accountInterest;
    }

    public AccountInterest getAccountInterest(){
        return this.accountInterest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<AccountEntry> getAccountEntryList() {
        return accountEntryList;
    }

    public void setAccountEntryList(List<AccountEntry> accountEntryList) {
        this.accountEntryList = accountEntryList;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Info :: accountNumber = " + accountNumber + ", "+customer;
    }
}