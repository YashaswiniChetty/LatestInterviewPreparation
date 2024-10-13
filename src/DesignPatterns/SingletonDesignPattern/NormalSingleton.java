package DesignPatterns.SingletonDesignPattern;

public class NormalSingleton {
    private  static NormalSingleton normalSingleton;
    private NormalSingleton(){

    }
    public  static NormalSingleton getInstance(){
        if(normalSingleton==null){
            return new NormalSingleton();
        }
        return normalSingleton;
    }
}
