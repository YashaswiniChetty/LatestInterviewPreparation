package DesignPatterns.FcatoryDesignPattern;

public class DriverClass {
    public static void main(String[] args) {
        ShapeFcatory shapeFcatory = new ShapeFcatory();
        Shape triagnle= shapeFcatory.getInstance("Triangle");
        triagnle.draw();
        Shape rect= shapeFcatory.getInstance("Rectangle");
        rect.draw();
    }


}
