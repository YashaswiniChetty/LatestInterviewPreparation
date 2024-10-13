package Comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new myComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
class myComparator1 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
      Integer I1=(Integer)o1;
      Integer I2=(Integer)o2;
    //  return I1.compareTo(I2);//ascending order
  return I2.compareTo(I1);//descending order
 //   return-I2.compareTo(I1);//ascending order
 //   return-I1.compareTo(I2);//descending order
  // return +1; place always after insertion order
  // retrun -1; place always befor reverse of insertion order
  // return 0; inserts only 1st element
      //similarly
      
      
      
      
	}
	
}
