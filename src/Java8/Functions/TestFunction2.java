package Java8.Functions;

import java.util.function.Function;

public class TestFunction2 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 =i->i*i;
        Function<Integer, Integer> f2 =i->2*i;
        System.out.println(f1.andThen(f2).apply(2));
    }
}
