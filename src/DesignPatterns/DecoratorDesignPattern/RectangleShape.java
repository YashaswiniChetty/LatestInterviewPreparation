package DesignPatterns.DecoratorDesignPattern;

public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
