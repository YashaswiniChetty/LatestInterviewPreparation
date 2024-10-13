package Comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator4 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new myComparator3());
		t.add(new StringBuffer("Raja"));
		t.add(new StringBuffer("Shoba"));
		t.add(new StringBuffer("Ruma"));
		t.add(new StringBuffer("Rhom"));
		t.add(new StringBuffer("Yahsu"));
		System.out.println(t);

	}

}
class myComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2=o2.toString();
		//return s1.compareTo(s2);//according to alpabetical order
		return s2.compareTo(s1);//according to  reverse alpabetical order
	//   return-s2.compareTo(s1);//ascending order
		 //   return-s1.compareTo(s2);//descending order
		  // return +1; place always after insertion order
		  // retrun -1; place always befor reverse of insertion order
		  // return 0; inserts only 1st element
	}
	
}
