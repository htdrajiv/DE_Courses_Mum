/**
 * Created by Rajiv on 4/2/2017.
 */
public class HighSpeed extends FanState {
    public HighSpeed(CeilingFan fan) {
        super(fan);
        System.out.println( "high speed" );
    }

    public void pullgreen() {
        fan.setState(fan.getOffStatus(false));
    }

    public void pullred() {
        fan.setState(fan.getHighSpeedStatus());
    }
}
