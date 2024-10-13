package DesignPatterns.ObserverDesignPattern;

public class YouTubeDerivedClass {

    public static void main(String[] args) {
             Channel telusko = new Channel();
             Subscriber s1=new Subscriber("Akshya");
        Subscriber s2=new Subscriber("Krishiv");
        Subscriber s3=new Subscriber("Ruhee");
        Subscriber s4=new Subscriber("Shreya");
        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);
        telusko.unSubscribe(s3);
        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        s4.subscribeChannel(telusko);
        telusko.uplod("Design Patterns Part1");
    }
}

