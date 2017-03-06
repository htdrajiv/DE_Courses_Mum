package observer;

import service.Subject;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class EmailSender implements ObserverAccountCreation {

    @Override
    public void updateCreation() {
        System.out.println("Email Update");
    }

    public EmailSender(Subject observableObject ){
        observableObject.registerObserverCreation(this);
    }
}