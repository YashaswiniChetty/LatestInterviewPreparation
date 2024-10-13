package GeneralPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachCharactersInArray {

	public static void main(String[] args) {
	int [] a=new int[] {2,3,4,5,3,3,1};

	HashMap<Integer,Integer> countmap=new HashMap<>();
	for(int i=0;i<a.length;i++) {
		if(countmap.containsKey(a[i])) {
			countmap.put(a[i], countmap.get(a[i])+1);
			}
		else {
			countmap.put(a[i], 1);
			}
	}
	 for (Map.Entry entry : countmap.entrySet()) { 
         System.out.println(entry.getKey() + " " + entry.getValue()); 
     } 
	}

}
