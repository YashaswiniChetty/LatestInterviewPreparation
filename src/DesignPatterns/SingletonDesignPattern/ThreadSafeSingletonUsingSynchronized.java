package DesignPatterns.SingletonDesignPattern;

public class ThreadSafeSingletonUsingSynchronized {
    private  static ThreadSafeSingletonUsingSynchronized safeSingletonUsingSynchronized;
    private ThreadSafeSingletonUsingSynchronized(){

    }
    public  static synchronized ThreadSafeSingletonUsingSynchronized getInstance(){
        if(safeSingletonUsingSynchronized==null){
            return new ThreadSafeSingletonUsingSynchronized();
        }
        return safeSingletonUsingSynchronized;
    }
}
