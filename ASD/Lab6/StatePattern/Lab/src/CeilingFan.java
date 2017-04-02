/**
 * Created by Rajiv on 4/2/2017.
 */
public class CeilingFan {
    FanState state;

    public void setState(FanState state) {
        this.state = state;
    }

    public void pullgreen() {
        state.pullgreen();
    }

    public void pullred() {
        state.pullred();
    }

    public FanState getOffStatus(Boolean start){
        return new OffState(this,start);
    }

    public FanState getHighSpeedStatus(){
        return new HighSpeed(this);
    }

    public FanState getLowSpeedStatus(){
        return new LowSpeed(this);
    }

    public FanState getMediumSpeedStatus(){
        return new MediumSpeed(this);
    }
}
