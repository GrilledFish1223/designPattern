package com.ping.observer2;

/**
 * 抽象被观察者
 */
public interface Observerable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
