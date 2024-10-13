package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsingSortedDNSO {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(80);
        List<Integer> list1 =  list.stream().sorted().collect(Collectors.toList());
        list1.stream().forEach(i->System.out.println(i));
    }
}
