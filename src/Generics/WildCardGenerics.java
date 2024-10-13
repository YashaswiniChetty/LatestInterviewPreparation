package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics {
    public static void main(String[] args) {
        WildCardGenerics wildCardGenerics = new WildCardGenerics();


        //Unbounded
        List<Object> list =  new ArrayList<>();
        list.add("abc");
        list.add(123);
        list.add(7777);
        wildCardGenerics.printListUnbounded(list);

        //lower bound n lists of Integer and the supertypes of Integer, such as Integer, Number, and Object
        List<Object> list1 =  new ArrayList<>();
        list1.add("abc");
        list1.add(123);
        list1.add(7777);
        wildCardGenerics.printListLowerBounded(list1);


        //uppper bound any child class of Number such int float double long etc
        List<Integer> list2 =  new ArrayList<>();
        list2.add(123);
        list2.add(7777);
        wildCardGenerics.printListUpperBounded(list2);
    }

    public void printListUnbounded(List< ? > list){
        System.out.println(list);
    }
    public void printListLowerBounded(List< ? super Integer > list1){
        System.out.println(list1);
    }

    public void printListUpperBounded(List< ? extends Number > list2){
        System.out.println(list2);
    }
}
