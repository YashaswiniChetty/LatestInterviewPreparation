package DesignPatterns.FcatoryDesignPattern;



public class ShapeFcatory {

    public Shape getInstance(String shape){
        if(shape==null){
            return null;
        }
        if(shape.equalsIgnoreCase("Triangle")){
            return new TriangleShape();
        }
        if(shape.equalsIgnoreCase("Rectangle")){
            return new RectangleShape();
        }
        return null;
    }
}
