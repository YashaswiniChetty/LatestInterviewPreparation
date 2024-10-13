package Java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsingMinMax {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("bbbb");
        list.add("ccccccc");
        list.add("aaa");
        Comparator<String> comparator = (s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if (l1 < l2)
                return -1;
            else if (l1 > l2)
                return +1;
            else return s1.compareTo(s2);
        };
       String min= list.stream().min(comparator).get();
        String max= list.stream().max(comparator).get();
        System.out.println(min+"  "+ max);
        System.out.println("======================");

        Comparator<String> comparator1 = (s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if (l1 < l2)
                return +1;
            else if (l1 > l2)
                return -1;
            else return s1.compareTo(s2);
        };
        String min1= list.stream().min(comparator1).get();
        String max1= list.stream().max(comparator1).get();
        System.out.println(min1+"  "+ max1);
        System.out.println("=================");

            List<Integer> list3 = new ArrayList<>();
            list3.add(10);
            list3.add(20);
            list3.add(50);
            list3.add(40);
            list3.add(80);
            Comparator<Integer> comparator2=(i1,i2)->{
                if(i1<i2)
                    return +1;
                else if(i1>i2)
                    return -1;
                else return 0;
            };
            Integer min2=list3.stream().min(comparator2).get();
        Integer max2=list3.stream().max(comparator2).get();
        System.out.println(min2+"  "+ max2);
        System.out.println("=================");
        List<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(50);
        list4.add(40);
        list4.add(80);
        Comparator<Integer> comparator3=(i1,i2)->{
            if(i1<i2)
                return -1;
            else if(i1>i2)
                return +1;
            else return 0;
        };
        Integer min3=list4.stream().min(comparator3).get();
        Integer max3=list4.stream().max(comparator3).get();
        System.out.println(min3+"  "+ max3);
        System.out.println("=================");


    }
}
