package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharByFrequency {
    public  static String frequencySort(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       for(char c: s.toCharArray()){
           map.put(c, map.getOrDefault(c,0)+1);
       }
      // System.out.println(map);
       //sort char based on count in descending order
       PriorityQueue<Character> queue = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
       queue.addAll(map.keySet());//add all keys which are char based on lamda comparator in desc
        //System.out.println(queue);//etr
        StringBuilder stringBuilder = new StringBuilder();
        while(!queue.isEmpty()){
            char c= queue.poll();
            for(int i=0;i<map.get(c);i++){
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();



    }

    public static void main(String[] args) {
       System.out.println(frequencySort("trrrrrreee"));
    }
}
