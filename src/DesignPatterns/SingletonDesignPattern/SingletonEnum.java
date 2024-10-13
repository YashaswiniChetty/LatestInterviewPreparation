package DesignPatterns.SingletonDesignPattern;

public class SingletonEnum {
    public static void main(String[] args) {
        Singleton singleton=Singleton.SINGLETON;
        System.out.println(singleton.hashCode());
        Singleton singleton1=Singleton.SINGLETON;
        System.out.println(singleton1.hashCode());
    }
}
enum Singleton{
    SINGLETON;
 }
