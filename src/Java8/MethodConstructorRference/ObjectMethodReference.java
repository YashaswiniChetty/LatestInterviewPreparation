package Java8.MethodConstructorRference;

public class ObjectMethodReference {
    public static void main(String[] args) {
        ObjectMethodReference o= new ObjectMethodReference();

      MyInteface inteface = o::setName;
      inteface.getName();
    }

    public void setName(){
        System.out.println("Setting name");
    }
}

interface MyInteface{
    public void getName();
}


