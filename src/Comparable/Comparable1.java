package Comparable;

import java.util.TreeSet;

public class Comparable1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();//default natural sorting   objetcs should be comaparable
		t.add("B");
		t.add("Z");//obj1.compareTo(obj2)   Z.compareTo(B)  return +ve  after
		t.add("A");//obj1.compareTo(obj2)   A.compareTo(B)  return -ve before
		t.add("Y");//obj1.compareTo(obj2)   Y.compareTo(B)  return +ve after
		System.out.println(t);//OUTPUT [A,B,Y,Z]
		

	}

}
