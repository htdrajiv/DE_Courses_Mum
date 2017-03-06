package service;

import observer.ObserverAccountCreation;
import observer.ObserverAccountModification;

/**
 * Created by Rajiv on 3/5/2017.
 */
public interface Subject {

    public void registerObserverCreation(ObserverAccountCreation observer);
    public void removeObserverCreation(ObserverAccountCreation observer);
    public void notifyObserversCreation();

    public void registerObserverChanging(ObserverAccountModification observer);
    public void removeObserverChanging(ObserverAccountModification observer);
    public void notifyObserversChanging();

}