package DesignPatterns.DecoratorDesignPattern;

public class DerivedMainClass {
    public static void main(String[] args)
    {

        Shape triangle = new TriangleShape();
        Shape redTriangle = new RedColourDecorator(new TriangleShape());
        Shape redRectangle = new RedColourDecorator(new RectangleShape());
        // Draw normal triangle
        triangle.draw();
        System.out.println(".........");
        // make the triangle red
        redTriangle.draw();
        System.out.println(".........");
        // make the rectangle red
        redRectangle.draw();
        System.out.println(".........");
    }
}
