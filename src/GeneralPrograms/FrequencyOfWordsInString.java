package GeneralPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyOfWordsInString {

	public static void main(String[] args) {
		String s="Yashu is gud is gud";
		String [] str=s.split(" ");
		HashMap<String,Integer> count=new HashMap<>();
		for(String s1:str){
			count.put(s1,count.getOrDefault(s1,0)+1);
		}
  
		 for (Map.Entry<String,Integer> entry :count.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue());

	}

}
