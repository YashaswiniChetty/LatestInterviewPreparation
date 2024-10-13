package DesignPatterns.AdapterDesignPattern;

public class PenAdapter implements Pen {

    PioletPen pioletPen = new PioletPen();
    @Override
    public void write(String str) {
       pioletPen.writewithPoiletpen(str);
    }
}
