package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(7);
        list1.add(90);
        list1.add(46);
        List<Integer> list2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2.toString());
        List<Integer> list3 = list1.stream().map(i->i+2).collect(Collectors.toList());
        System.out.println(list3.toString());
        long count = list1.stream().filter(i->i%2==0).count();
        System.out.println(count);
        List<Integer> list4 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list4.toString());

    }
}
