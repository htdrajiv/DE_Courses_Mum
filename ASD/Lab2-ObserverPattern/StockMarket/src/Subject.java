/**
 * Created by Rajiv on 3/5/2017.
 */
public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObserver();
}
