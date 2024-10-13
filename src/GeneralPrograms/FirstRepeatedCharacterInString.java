package GeneralPrograms;

import java.util.HashSet;

public class FirstRepeatedCharacterInString {

	public static void main(String[] args) {
		  String str = "Yashaswini"; 
	       char[] arr = str.toCharArray();
		   HashSet<Character> h = new HashSet<>(); 
           for (int i=0; i<arr.length; i++) 
	        { 
	            char c = arr[i]; 
                 if (h.contains(c)) {
	               System.out.println(c);
	               break;
	            }
	        else {
	                h.add(c); 
	        }
	        }   
	}
	  
}
