package DesignPatterns.ObserverDesignPattern;



public class Subscriber implements Observer {

    private String name;
    private Channel channel;

    public Subscriber(String name) {
        super();
        this.name = name;
    }

    //updates Subscribers when lastest video is added to channel
    @Override
    public void update(){
        System.out.println("Hey"+ name+ "Video uploaded");
    }

    @Override
    public void subscribeChannel(Channel ch){
        channel=ch;
    }
}
