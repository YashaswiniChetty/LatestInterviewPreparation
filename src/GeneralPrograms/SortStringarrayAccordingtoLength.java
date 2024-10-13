package GeneralPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortStringarrayAccordingtoLength {

	public static void main(String[] args) {
		//normal method
	String[] arr= {"Yashu","Yad","Giri"}	;
	/*int n=arr.length;
	for(int i=1;i<n;i++) {
		  String temp=arr[i];
		 int j=i-1;
		 while(j>=0 && temp.length()<arr[j].length()) {
			 arr[j+1]=arr[j];
			 j--;
			 
		 }
		 arr[j+1]=temp;
		 }
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}*/
		//using comparator
		/*String[] words = {"abc", "xy", "aaaa","d"};
		 
        //Create an object of Comparator        
		Comparator<String> lengthComparator = new Comparator<String>() {
    		@Override    
			public int compare(String o1, String o2) {
        		return Integer.compare(o1.length(), o2.length());
    		}
		};
 
		//Sort the array
		Arrays.sort(words, lengthComparator);
 
        //Printing out the sorted array   						 
		System.out.println(Arrays.deepToString(words));*/
        HashMap<String, Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],arr[i].length());
        }
        PriorityQueue<String> queue = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        queue.addAll(map.keySet());
        String string[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            string[i]=queue.poll();
        }
        for(int i=0;i<arr.length;i++){
           System.out.print(string[i]);
        }

}
	}
