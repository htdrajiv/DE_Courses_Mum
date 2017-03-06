package observer;

import service.Subject;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class Logger implements ObserverAccountCreation {

    @Override
    public void updateCreation() {
        System.out.println("Logger Update");
    }

    public Logger(Subject observableObject) {
        observableObject.registerObserverCreation(this);
    }

}