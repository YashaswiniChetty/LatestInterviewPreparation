package DesignPatterns.DecoratorDesignPattern;

public class RedColourDecorator extends ShapeDecoratorAbastract {
    public RedColourDecorator(Shape shape)
    {
        super(shape);
    }

    @Override
    public void draw()
    {
        shape.draw();
        setRedBorder(shape);
    }
    private void setRedBorder(Shape shape)
    {
        System.out.println("Red color border added..."+ shape);
    }
}
