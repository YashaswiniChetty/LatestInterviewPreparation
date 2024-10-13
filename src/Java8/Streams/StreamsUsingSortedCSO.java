package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsingSortedCSO {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(80);
       List<Integer> list1=list.stream().sorted((i1,i2)->(i1<2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
        List<Integer> list2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        List<Integer> list3=list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
       list1.stream().forEach(i-> System.out.println(i));
       System.out.println("================");
       list2.stream().forEach(i->System.out.println(i));
        System.out.println("================");
        list3.stream().forEach(i->System.out.println(i));
        list3.stream().forEach(System.out::println);
    }
}
