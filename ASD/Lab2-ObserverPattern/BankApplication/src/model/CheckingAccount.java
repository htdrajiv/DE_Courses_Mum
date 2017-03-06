
package model;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class CheckingAccount extends Account {
    public CheckingAccount(){
        setInterest(new CheckingAccountInterest());
    }
}