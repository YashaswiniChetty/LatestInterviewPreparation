package LeetCode;

import java.util.PriorityQueue;

public class KTHMaximum {
    public static void main(String[] args) {
      int nums[] = {3,2,1,5,6,4};
      int k = 5;
      System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        //added in queue according to some priority and doesnot allow duplicates DNSO asc
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i :nums){
            p.add(i);//123456


        }
        System.out.println(p);
        return 0;

    }
}
