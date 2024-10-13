package Heap.TopKFrequentWords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
//tc(Nlog(k))
public class LeetCode {
    public  static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word :words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        PriorityQueue<String> que = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
       /* PriorityQueue<String> que = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String word1, String word2){
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);
                if(frequency1 == frequency2){
                    return word2.compareTo(word1);//greater alphabatical order
                }
                return frequency1 - frequency2;//sort by lesser frequency
            }
        });*/
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            que.add(entry.getKey());
            if(que.size()>k){
                que.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while(!que.isEmpty()){
            list.add(que.poll());
        }
        //Collections.reverse(list);
        System.out.println(list);
        return list;
    }

   /* public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word :words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        System.out.println(map);
        PriorityQueue<String> queue =  new PriorityQueue<>();
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            queue.offer(entry.getKey());
            if(queue.size()>k){
                queue.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while(!queue.isEmpty()){
            list.add(queue.poll());
        }
        Collections.reverse(list);
        System.out.println(list);
        return list;


    }*/

    public static void main(String[] args) {
        String[] strings = {"i","love","leetcode","i","love","coding","i"};
        topKFrequent(strings, 2);
    }
}
