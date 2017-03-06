package service;

import observer.ObserverAccountCreation;
import observer.ObserverAccountModification;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/5/2017.
 */

public class SubjectAccountServiceImp implements Subject {
    List<ObserverAccountCreation> observerList;
    List<ObserverAccountModification> observerChangingList;

    public SubjectAccountServiceImp(){
        observerList= new ArrayList<>();
        observerChangingList= new ArrayList<>();
    }

    @Override
    public void registerObserverCreation(ObserverAccountCreation observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserverCreation(ObserverAccountCreation observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserversCreation() {
        for(ObserverAccountCreation observerAccountCreation :observerList){
            observerAccountCreation.updateCreation();
        }
    }

    @Override
    public void registerObserverChanging(ObserverAccountModification observer) {
        observerChangingList.add(observer);
    }

    @Override
    public void removeObserverChanging(ObserverAccountModification observer) {
        observerChangingList.remove(observer);
    }

    @Override
    public void notifyObserversChanging() {
        for(ObserverAccountModification observerAccountModification :observerChangingList){
            observerAccountModification.NotifyAccountChanged();
        }
    }
}