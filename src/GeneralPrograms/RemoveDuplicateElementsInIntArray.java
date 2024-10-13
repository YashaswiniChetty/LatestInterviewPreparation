package GeneralPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementsInIntArray {

/*	public static void main(String[] args) {
		Integer[] array1 = {1, 2, 2, 4, 5, 7, 7};
		List l=new ArrayList();
		for(int i=0;i<array1.length;i++) {
			l.add(array1[i]);
		}
		Set s=new HashSet(l);
		System.out.println(s);

	}*/
	public static void main(String[] args) {
		 Integer[] array1 = {1, 2, 3, 9, 9, 7, 7};
	       Set s=new HashSet();

		 for(int i=0;i<array1.length;i++){

		 if(s.add(array1[i])==false) {
			 System.out.println(array1[i]);
			 s.remove(array1[i]);
		 }
}
		 System.out.println(s);

}

}
