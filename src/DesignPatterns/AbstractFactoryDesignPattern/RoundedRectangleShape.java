package DesignPatterns.AbstractFactoryDesignPattern;

public class RoundedRectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Rectangle drawn");
    }
}
