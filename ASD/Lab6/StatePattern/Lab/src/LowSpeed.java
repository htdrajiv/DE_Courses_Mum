/**
 * Created by Rajiv on 4/2/2017.
 */
public class LowSpeed extends FanState {
    public LowSpeed(CeilingFan fan) {
        super(fan);
        System.out.println( "low speed" );
    }

    public void pullgreen() {
        fan.setState(fan.getMediumSpeedStatus());
    }

    public void pullred() {
        fan.setState(fan.getOffStatus(false));
    }
}
