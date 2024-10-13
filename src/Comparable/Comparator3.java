package Comparable;

import java.util.Comparator;
import java.util.TreeSet;
//coustom sorting
public class Comparator3 {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new myComparator2());
	t.add("Raja");
	t.add("Shoba");
	t.add("RajaKumar");
	t.add("Ganga");
	t.add("Ramu");
	System.out.println(t);
}
}
class myComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;//or o1.toString();
		String s2=(String)o2;
		//return s1.compareTo(s2);//according to alpabetical order
		return s2.compareTo(s1);//according to  reverse alpabetical order
	//   return-s2.compareTo(s1);//ascending order
		 //   return-s1.compareTo(s2);//descending order
		  // return +1; place always after insertion order
		  // retrun -1; place always befor reverse of insertion order
		  // return 0; inserts only 1st element
	}
	
}
