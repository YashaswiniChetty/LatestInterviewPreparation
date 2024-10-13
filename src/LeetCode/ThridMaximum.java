package LeetCode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThridMaximum {
    public static void main(String[] args) {
    /*    int a[] = {1,2 ,3 , 4};
        int max=0;
        int sec_max=0;
        int thrid_max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]>sec_max){
                sec_max=a[i];
            }
        }*/
        int a[] = {1,2 ,3 , 4,5};
        int max=thirdMax(a);
        System.out.println(max);

    }

    public  static int thirdMax(int[] nums) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->a-b);
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
                que.add(i);
                if (que.size() > 3) {
                    set.remove(que.poll());
                }
            }
        }
        if (que.size() == 2) {
            que.poll();
        }
        return que.peek();
    }

}
