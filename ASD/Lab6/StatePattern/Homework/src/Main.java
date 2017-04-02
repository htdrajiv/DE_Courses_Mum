/**
 * Created by Rajiv on 4/1/2017.
 */

public class Main {
    public static void main(String[] args) {
        FFAccount ffaccount = new FFAccount("234322");
        ffaccount.addFlight(13111);
        System.out.println("Account Number = " + ffaccount.getAccountNumber());
        System.out.println("Account type = " + ffaccount.getAccountType());
        System.out.println("miles = " + ffaccount.getNumberOfMiles());

        ffaccount.addFlight(99999);
        System.out.println("Account Number = " + ffaccount.getAccountNumber());
        System.out.println("Account type = " + ffaccount.getAccountType());
        System.out.println("miles = " + ffaccount.getNumberOfMiles());

        ffaccount.addFlight(40888);
        System.out.println("Account Number = " + ffaccount.getAccountNumber());
        System.out.println("Account type = " + ffaccount.getAccountType());
        System.out.println("miles = " + ffaccount.getNumberOfMiles());
    }
}
