package Comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1 {
//sorting in descending order  using comparator
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new myComparator());
		t.add(10);
		t.add(0);  //compare(0,10)  return +ve
		t.add(15);//compare(15,10)  return -ve
		t.add(20);//compare(20,10)  return -ve, compare(20,15)  return -ve
		t.add(20);//compare(20,10)  return -ve,comapre(20,15) return -ve , compare(20.20) return 0
		System.out.println(t);

	}

}
class myComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		if(I1<I2) {
			return +1;
		}else if(I1>I2) {
			return -1;
		}else {
			return 0;
		}
	}
}
