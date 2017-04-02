/**
 * Created by Rajiv on 4/1/2017.
 */
public class Silver implements AccountState{

    FFAccount account;
    public Silver(FFAccount newaccount) {
        account = newaccount ;
    }
    public void addFlight( int newMiles) {
        account.setNumberOfMiles( account.getNumberOfMiles() + newMiles);
        account.setNumberOfFlights( account.getNumberOfFlights() + 1);
        checkForUpgrade();
    }
    public void checkForUpgrade() {
        if (( account.getNumberOfMiles() > 75000)||(account.getNumberOfFlights() > 75)){
            AccountState newState = new Gold( account ) ;
            account.setAccountState(newState);
        }
    }
    public String getAccountType() {
        return "Silver" ;
    }
}
