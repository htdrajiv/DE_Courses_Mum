/**
 * Created by Rajiv on 4/2/2017.
 */
public class Application {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        fan.setState(fan.getOffStatus(true));

        fan.pullgreen();
        fan.pullgreen();
        fan.pullred();
        fan.pullgreen();
        fan.pullred();
        fan.pullred();
        fan.pullgreen();
    }
}
