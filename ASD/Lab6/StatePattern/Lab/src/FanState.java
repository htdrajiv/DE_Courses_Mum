/**
 * Created by Rajiv on 4/2/2017.
 */
public abstract class FanState {
    CeilingFan fan;

    FanState(CeilingFan fan){
        this.fan=fan;
    }

    abstract void pullred();
    abstract void pullgreen();
}
