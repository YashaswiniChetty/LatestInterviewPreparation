package Java8.Consumer;

import java.util.function.Consumer;

public class TestConsumer1 {
    public static void main(String[] args) {
        Consumer<Integer> c1= i->System.out.println(i);
        c1.accept(10);
    }
}
