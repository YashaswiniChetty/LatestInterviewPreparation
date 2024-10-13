package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortAnArray {
    //ascending
   public static int[] sortArray(int[] nums) {
        ////PriorityQueue<Integer> que = new PriorityQueue<>();
       /*PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer i1, Integer i2) {
               return i1-i2;
           }
       });*/
       PriorityQueue<Integer> que = new PriorityQueue<>((i1, i2)-> i1-i2);
        for(int num:nums){
            que.offer(num);
        }//logn+n
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=que.poll();
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] nums={665,88,9,7,1};
        int []result= sortArray(nums);
        for(int i:result){
            System.out.println(i);
        }
    }
    //descending
  /*public static int[] sortArray(int[] nums) {
   PriorityQueue<Integer> que = new PriorityQueue<>((i1, i2)-> i2-i1);
      PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
          @Override
          public int compare(Integer i1, Integer i2) {
              return i2-i1;
          }
      });
      for(int num:nums){
          que.offer(num);
      }
      int [] arr=new int[nums.length];
      for(int i=0;i<nums.length;i++){
          arr[i]=que.poll();
      }
      return arr;
  }

    public static void main(String[] args) {
        int [] nums={665,88,9,7,1};
        int []result= sortArray(nums);
        for(int i:result){
            System.out.println(i);
        }
    }*/
}
