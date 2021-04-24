package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        //for kth smallest do reverse
        //added in queue according to some priority and doesnot allow duplicates DNSO asc
  /*PriorityQueue<Integer> que= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            que.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            que.poll();
        }
        return que.peek();*/

        PriorityQueue<Integer> que= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            que.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>que.peek()){
                que.poll();
                que.add(nums[i]);
            }
        }
        return que.peek();
    }
}
