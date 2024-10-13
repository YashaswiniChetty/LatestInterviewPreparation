package GeneralPrograms;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ShortestAndLongestWord {

	public static void main(String[] args) {
		String s="Yashu is gud";
		/*int shortestlen=s.length();
		int longestlen=0;
		s=s+" ";
		String sho= "";
		String lon= "";
		String [] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>longestlen) {
				lon=words[i];
			}
			else if(words[i].length()<shortestlen) {
				sho=words[i];
				
			}
		}
		System.out.println(lon);
		System.out.println(sho);*/

		//====================
        String [] arr=s.split(" ");
        HashMap<String, Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],arr[i].length());
        }
        PriorityQueue<String> queue = new PriorityQueue<>((a, b)->map.get(a)-map.get(b));
        queue.addAll(map.keySet());
        System.out.println("Shortest"+queue.peek());
        String [] arr1=s.split(" ");
        HashMap<String, Integer> map1 =new HashMap<>();
        for(int i=0;i<arr1.length;i++) {
            map1.put(arr1[i],arr1[i].length());
        }
        PriorityQueue<String> queue1 = new PriorityQueue<>((a, b)->map1.get(b)-map1.get(a));
        queue1.addAll(map1.keySet());
        System.out.println("longest"+queue1.peek());



	}

}
