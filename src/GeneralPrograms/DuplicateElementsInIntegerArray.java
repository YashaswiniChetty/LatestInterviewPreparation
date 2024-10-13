package GeneralPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInIntegerArray {

	public static void main(String[] args) {
		 Integer[] array1 = {1, 2, 3, 9, 9, 7, 7};
	       Set s=new HashSet();

		 for(int i=0;i<array1.length;i++){
      
		 if(s.add(array1[i])==false) {
			 System.out.println(array1[i]);
		 }
}

}
}
/*for (int i = 0; i < names.length; i++)
{ for (int j = i + 1 ; j < names.length; j++) 
{ if (names[i].equals(names[j])) 

}{ // got the duplicate element } } }
}
*/
