/**
 * Created by Rajiv on 4/2/2017.
 */
public class MediumSpeed extends FanState {
    public MediumSpeed(CeilingFan fan) {
        super(fan);
        System.out.println( "medium speed" );
    }

    public void pullgreen() {
        fan.setState(fan.getMediumSpeedStatus());
    }

    public void pullred() {
        fan.setState(fan.getLowSpeedStatus());
    }
}
