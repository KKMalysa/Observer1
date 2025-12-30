package com.KKMalysa.order;

import com.KKMalysa.notification.Observer;

public interface Obervable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
