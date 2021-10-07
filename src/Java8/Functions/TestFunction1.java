package Java8.Functions;

import Java8.Student;

import java.util.function.Function;
import java.util.function.Predicate;
/*@FunctionalInterface
public interface Function<T, R> {

    *//**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     *//*
    R apply(T t);*/
public class TestFunction1 {
    public static void main(String[] args) {
        Function<String, Integer> func1=s-> s.length();
        System.out.println(func1.apply("yashu"));
        System.out.println("=========================");
        Function<String, String> func2=s-> s.toUpperCase();
        System.out.println(func2.apply("yashu"));
        System.out.println("=========================");
        Function<Student, String> func3= s->{
            int marks= s.marks;
            String grade="";
            if(marks>80){
                grade="A";
            }
            if(marks>=80){
                grade="A";
            }else if(marks>=60){
                grade="B";
            }else if(marks>=40){
                grade="C";
            }else {
                grade="Fail";
            }
            return grade;

        };
        System.out.println(func3.apply(new Student(75)));
        Student student = new Student(75);
        Predicate<Student> p1=s->s.marks>60;
        if(p1.test(student)){
            System.out.println(func3.apply(student));
        }



    }
}
