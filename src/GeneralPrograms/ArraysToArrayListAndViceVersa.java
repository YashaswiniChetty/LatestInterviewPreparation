package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArraysToArrayListAndViceVersa {

	public static void main(String[] args) {
		//ArrayTolist
	    /*String sArray[] = new String[] { "A", "B", "C" };
	    List<String> list=Arrays.asList(sArray);
        System.out.println(list);
        for(String s:list) {
	    System.out.println(s);
		
   }*/
	List<String>list=new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	String []s=new String[list.size()];
	/* for (int i =0; i < list.size(); i++) {
         s[i] = list.get(i); 
         System.out.println(s[i]);
	}*/
	String[] arr = list.toArray(new String[list.size()]); 

}
}
