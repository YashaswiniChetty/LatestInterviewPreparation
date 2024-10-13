package DesignPatterns.AbstractFactoryDesignPattern;

public class ShapeFcatory extends AbstarctFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Triangle")){
            return new TriangleShape();
        }
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new RectangleShape();
        }

        return null;
    }
}
