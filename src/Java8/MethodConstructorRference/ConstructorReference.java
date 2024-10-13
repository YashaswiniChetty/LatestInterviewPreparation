package Java8.MethodConstructorRference;

public class ConstructorReference {

    ConstructorReference(){
        System.out.println("i am so butiful");
    }
    public static void main(String[] args) {
        MyInteface1 myInteface1=ConstructorReference::new;
       ConstructorReference constructorReference= myInteface1.getName();
    }


}


interface MyInteface1{
    public ConstructorReference getName();
}
