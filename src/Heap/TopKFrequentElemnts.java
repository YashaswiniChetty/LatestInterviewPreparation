package Heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElemnts {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            que.add(entry.getKey());
            if(que.size()>k){
                que.poll();
            }
        }
        int [] arr = new int[k];
        int i=0;
        while(!que.isEmpty()){
            arr[i]= que.poll();
            i++;
        }

        return arr;
    }


    public static void main(String[] args) {
        int nums[]= {1,1,1,2,2,3};
        int [] result= topKFrequent(nums, 2);
        for(int i: result){
            System.out.println(i);
        }

    }


}
