package Java8.Predicate;

import Java8.Employeee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*@FunctionalInterface
public interface Predicate<T> {

   abstract boolean test(T t);
}*/
/*It is a functional interface which represents a predicate (boolean-valued function) of one argument.
It is defined in the java.util.function package and contains test() a functional method.*/
public class TestPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i%2==0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));
        System.out.println("===============================");
        Predicate<String> p1 = str -> str.length()>5;
        System.out.println(p1.test("Yas"));
        System.out.println("===============================");
        String[] strArr = {"asdgks","aaHJKH","Hh","Jhh"} ;
        Predicate<String> p2 = str2->str2.length()>=3;
        for(String str2: strArr){
            if(p2.test(str2)){
                System.out.println(str2);
            }
        }
        System.out.println("===============================");
        List<Employeee> list = new ArrayList<>();
        list.add(new Employeee("wsjhajk", 100000));
        list.add(new Employeee("AG", 1));
        list.add(new Employeee("AAAA", 2393));
        list.add(new Employeee("AAGGGAG", 545));
        Predicate<Employeee> p3 = e -> e.salary>3000;
        for(Employeee employeee: list){
            if(p3.test(employeee)){
                System.out.println(employeee.name);
            }
        }


    }
}
