package Java8.MethodConstructorRference;

public class StaticMethodReference {
    public static void main(String[] args) {
       Runnable runnable = StaticMethodReference::setName;
       Thread thread =  new Thread(runnable);
       thread.start();
    }
    public static void setName(){
        System.out.println("i am setting name");
    }
}
