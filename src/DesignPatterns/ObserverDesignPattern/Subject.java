package DesignPatterns.ObserverDesignPattern;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void notifySubscriber();

    void uplod(String title);
}
