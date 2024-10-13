package Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MximumProductTwoElementsArray {
    public static void main(String[] args) {
        int nums[] = {3,4,5,2};
        int max= maxProduct(nums);
        System.out.println(max);

    }

    public static  int maxProduct(int[] nums) {
   /*     PriorityQueue<Integer> que= new PriorityQueue<Integer>(new Comparator<Integer>() {

                    // Compare method for place element in
                    // reverse order
                    public int compare(Integer a, Integer b)
                    {
                        if (a < b)
                            return 1;
                        if (a > b)
                            return -1;
                        return 0;
                    }
                });
        for(int num:nums){
            que.offer(num);
        }
        int first= (que.peek()-1);
        int second=(que.peek()-1);
        return first*second;
*/

        PriorityQueue<Integer> que = new PriorityQueue<Integer>((a,b)->b-a);
         for(int num:nums){
                que.offer(num);
            }
        return (que.poll()-1)*(que.poll()-1);
    }
}
