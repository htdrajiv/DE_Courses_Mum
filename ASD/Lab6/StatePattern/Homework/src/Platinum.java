/**
 * Created by Rajiv on 4/1/2017.
 */
public class Platinum implements AccountState {
    FFAccount account;
    public Platinum(FFAccount newaccount) {
        account = newaccount ;
    }

    public void addFlight( int newMiles) {
        account.setNumberOfMiles(account.getNumberOfMiles() + (3 * newMiles));
        account.setNumberOfFlights(account.getNumberOfFlights() * 2);
    }

    public String getAccountType() {
        return "Platinum" ;
    }

    public void checkForUpgrade() {
        System.out.println("No upgrade plan for Platinum account");
    }
}
