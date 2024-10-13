package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//filter(Predicate)No of input elelmnts !=no of output elemnts, ie Predicate always return boolean value
public class StreamsUsingFilter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(80);
        List<Integer> list1 =  list.stream().filter(i-> i>=30).collect(Collectors.toList());
        list1.stream().forEach(i->System.out.println(i));
    }
}
