	package GeneralPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceofCharInString {

	  static void characterCount(String inputString) 
	    { 
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
           char[] strArray = inputString.toCharArray(); 
	       for (char c : strArray) { 
	          charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
	        } 
	  
	        for (Map.Entry entry : charCountMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	    } 
	 
	    public static void main(String[] args) 
	    { 
	        String str = "Ajjitii";
	        characterCount(str); 
	    }

}
