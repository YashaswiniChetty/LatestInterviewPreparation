package LeetCode;

import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
        int a[] = {1, 2, 3 ,9};
        System.out.println(Arrays.toString(onePlus(a)));
    }

    public static int[] onePlus(int []a){
        int len = a.length;
        for(int i=len-1; i>=0;i--){
            if(a[i]<9){
                a[i]++;
                return a;

            }
            a[i]=0;
        }
        int new_arr [] = new int[len+1];
        new_arr[0] = 1;
        return new_arr;
    }
}
