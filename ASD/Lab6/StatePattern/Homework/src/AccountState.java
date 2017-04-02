/**
 * Created by Rajiv on 4/1/2017.
 */
public interface AccountState {
    public void addFlight( int newMiles);
    public void checkForUpgrade();
    public String getAccountType();
}
