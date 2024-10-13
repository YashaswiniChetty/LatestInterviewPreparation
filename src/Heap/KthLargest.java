package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    public  static int findKthLargest(int[] nums, int k) {
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

        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            que.add(i);
            if(que.size()>k){
                que.poll();
            }
        }


        return que.poll();
    }

    public static void main(String[] args) {
      int nums[]= {2,4,6,3,1};
      System.out.println(findKthLargest(nums, 3));
    }
}
