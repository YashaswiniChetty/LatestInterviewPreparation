package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Subscriber> listOfSubscribers= new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Subscriber subscriber){
        listOfSubscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber){
        listOfSubscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(){
        for(Subscriber subscriber:listOfSubscribers){
            subscriber.update();
        }
    }

    @Override
    public void uplod(String title){
        this.title=title;
        notifySubscriber();

    }
}
