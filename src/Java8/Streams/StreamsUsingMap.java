package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
//map(function) No of input elelmnts=no of output elemnts, ie function may return or dont return value
public class StreamsUsingMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(80);
        List<Integer> list1=list.stream().map(i->i+5).collect(Collectors.toList());
        list1.stream().forEach(i->System.out.println(i));
    }
}
