package observer;

import service.Subject;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class SmsSender implements ObserverAccountModification  {

    @Override
    public void NotifyAccountChanged() {
        System.out.println("SMS sender");
    }

    public SmsSender(Subject observableObject){
        observableObject.registerObserverChanging(this);
    }
}