/**
 * Created by Rajiv on 4/1/2017.
 */
public class Gold implements AccountState {
    FFAccount account;
    public Gold(FFAccount newaccount) {
        account = newaccount;
    }

    public void addFlight(int newMiles) {
        account.setNumberOfMiles( account.getNumberOfMiles() + (2 * newMiles));
        account.setNumberOfFlights( account.getNumberOfFlights()+1);
        checkForUpgrade();
    }

    public void checkForUpgrade() {
        if (( account.getNumberOfMiles() > 150000) || (account.getNumberOfFlights() > 145)){
            AccountState newState = new Platinum( account ) ;
            account.setAccountState(newState);
        }
    }

    public String getAccountType() {
        return "Gold";
    }
}
