package DesignPatterns.SingletonDesignPattern;

public class StaticBlockInitialization {

    private  static StaticBlockInitialization staticBlockInitialization;

    private StaticBlockInitialization(){}
    static{
        staticBlockInitialization= new StaticBlockInitialization();
    }
    public  static StaticBlockInitialization getInstance(){
        return staticBlockInitialization;
    }
}
