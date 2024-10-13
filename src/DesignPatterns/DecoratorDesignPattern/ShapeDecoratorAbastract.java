package DesignPatterns.DecoratorDesignPattern;

public class ShapeDecoratorAbastract implements Shape {
    protected Shape shape;
    public ShapeDecoratorAbastract(Shape shape)
    {
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
    }
}
