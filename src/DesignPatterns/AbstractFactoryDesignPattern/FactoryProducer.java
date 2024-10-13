package DesignPatterns.AbstractFactoryDesignPattern;

public class FactoryProducer {
    public static AbstarctFactory getFactory(boolean rounded){
        if(rounded){
            return  new RoundedShapeFcatory();
        }else{
            return new ShapeFcatory();
        }
    }
}
