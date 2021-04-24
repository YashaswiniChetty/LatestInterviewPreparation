package Heap;

import java.util.Arrays;

public class BuildMaxHeap {
    public static void main(String[] args) {
        int[] A = {15, 8, 4, 3, 22};//{33,8,9,10}
        // int[] b = new int[A.length+1];
        int n = A.length;
        creatMaxHeap(A, n);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }

    public static void creatMaxHeap(int [] A, int n){
        //A[1] assume as largest and start from 2 and insert data
        for(int i=1; i<n;i++){
            inserIntoHeap(A, i);//pass index and Array
        }

    }

    public static void inserIntoHeap(int []A, int i){
      int temp = A[i];
      while(i>0 && temp > A[(i-1)/2]){
           A[i] = A[(i-1)/2];
          i=(i-1)/2;
      }
        A[i]=temp;
    }
}
