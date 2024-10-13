package DesignPatterns.ObserverDesignPattern;

public interface Observer {
    //updates Subscribers when lastest video is added to channel
    void update();

    void subscribeChannel(Channel ch);
}
