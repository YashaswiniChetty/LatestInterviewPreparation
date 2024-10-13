package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsUsingtoArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(80);
        Integer [] integers = list.stream().toArray(Integer[]::new);
    }
}
