package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElemnts {
    public static void main(String[] args) {
        int a[] = {1, 1,1,1,1};
         System.out.println(sumOfUnique(a));
    }
    public  static int sumOfUnique(int[] nums) {
        //key as element and value as frequency
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);

        }
        int sum =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           if(entry.getValue()==1){
             sum+=entry.getKey();
           }
        }


        return sum;
        }


    }


