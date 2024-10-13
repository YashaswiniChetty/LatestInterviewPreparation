package DesignPatterns.AbstractFactoryDesignPattern;

public class RoundedShapeFcatory extends AbstarctFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return  new RoundedRectangleShape();
        }
        return null;
    }
}
