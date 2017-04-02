/**
 * Created by Rajiv on 4/1/2017.
 */
public class FFAccount {

    private AccountState accountState;
    private String accountNumber;
    private int numberOfMiles;
    private int numberOfFlights;

    public FFAccount(String acntNumber) {
        accountNumber = acntNumber;
        accountState = new Silver( this );
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void addFlight(int newMiles){
        accountState.addFlight(newMiles);
    }

    public String getAccountType() {
        return accountState.getAccountType();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    public void setNumberOfFlights(int numberOfFlights) {
        this.numberOfFlights = numberOfFlights;
    }
}
