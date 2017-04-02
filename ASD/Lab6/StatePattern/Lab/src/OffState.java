/**
 * Created by Rajiv on 4/2/2017.
 */
public class OffState extends FanState {
    public OffState(CeilingFan fan, boolean start) {
        super(fan);
        if (!start)
            System.out.println( "turning off" );
    }

    public void pullgreen() {
        fan.setState(fan.getLowSpeedStatus());
    }

    public void pullred() {
        fan.setState(fan.getHighSpeedStatus());
    }
}

