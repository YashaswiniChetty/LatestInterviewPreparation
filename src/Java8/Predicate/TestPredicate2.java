package Java8.Predicate;

import java.util.function.Predicate;

public class TestPredicate2 {
    public static void main(String[] args) {
        Predicate<Integer> p1= i-> i%2==0;
        Predicate<Integer> p2= i-> i>=10;
        int[] arr={1,10, 80,3};
        for(int i: arr){
            if(p1.and(p2).test(i)){
                System.out.print(i+"==");
            }
        }
        System.out.println("======================");
        for(int i: arr){
            if(p1.or(p2).test(i)){
                System.out.print(i+"==");
            }
        }
        System.out.println("======================");
        for(int i: arr){
            if(p1.negate().test(i)){
                System.out.print(i+"==");
            }
        }
        System.out.println("======================");
        for(int i: arr){
            if(p2.negate().test(i)){
                System.out.print(i+"==");
            }
        }
        System.out.println("======================");
        for(int i: arr){
            if(p1.negate().and(p2.negate()).test(i)){
                System.out.print(i+"==");
            }
        }
    }
}
