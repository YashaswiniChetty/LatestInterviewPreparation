package GeneralPrograms;

import java.util.ArrayList;
import java.util.List;

public class LastElementInArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
	     al.add("Ajay");
	     al.add("Becky");
	     al.add("Chaitanya");
	     al.add("Dimple");
	     al.add("Rock");
	 
	     // Displaying ArrayList elements
	     System.out.println("ArrayList contains: "+al);
	 
	     // Logic to get the last element from ArrayList
	     if (al != null && !al.isEmpty()) {
	        System.out.println("Last element is:");
	        System.out.println(al.get(al.size()-1));
	     }
	}

}
