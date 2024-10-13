package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsingCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(80);
        long count =  list.stream().filter(i-> i>=30).count();
        System.out.println(count);
    }
}
