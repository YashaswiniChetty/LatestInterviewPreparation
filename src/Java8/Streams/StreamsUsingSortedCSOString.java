package Java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsingSortedCSOString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("bbbb");
        list.add("ccccccc");
        list.add("aaa");
        Comparator<String> comparator =(s1,s2)-> {
                int l1=s1.length();
                int l2=s2.length();
                if(l1<l2)
                    return -1;
                else if(l1>l2)
                    return +1;
                else return s1.compareTo(s2);
        };
        List<String> list1=list.stream().sorted(comparator).collect(Collectors.toList());
        list1.stream().forEach(i->System.out.println(i));
        System.out.println("=======================");
        Comparator<String> comparator1 =(s1,s2)-> {
            int l1=s1.length();
            int l2=s2.length();
            if(l1<l2)
                return +1;
            else if(l1>l2)
                return -1;
            else return s2.compareTo(s1);
        };
        List<String> list2=list.stream().sorted(comparator1).collect(Collectors.toList());
        list2.stream().forEach(i->System.out.println(i));

    }
}
