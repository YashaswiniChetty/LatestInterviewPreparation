package Arrays;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int uso;
    private int age;

    Student(String name, int uso, int age){
        this.name=name;
        this.uso=uso;
        this.age=age;
    }

    public String getname(){
        return this.name;
    }
    public int getuso(){
        return this.uso;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setuso(int uso){
        this.uso=uso;
    }
    public int getage(){
        return this.age;
    }
    public void setage(){
        this.age=age;
    }

    @Override
    public String toString() {
        return "StudentName "+this.getname() + " " + "UniversityStudentNo "+this.getuso() + " " + "StudentAge "+ this.getage();
    }

    public static void main(String [] args){
        Student s= new Student("s1", 1, 18);
        Student s1= new Student("s2", 2, 17);
        Student s2= new Student("s3", 3, 19);
        Student s3= new Student("s4", 4, 13);
        List<Student> list =new ArrayList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Comparator<Student> c=(S1, S2)->{
            int age1=S1.getage();
            int age2=S2.getage();
            if(age1<age2)
                return -1;
            if(age1>age2)
                return +1;
            else return 0;
        };
        List<Student> sorteStudent=list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sorteStudent);

    }


}
