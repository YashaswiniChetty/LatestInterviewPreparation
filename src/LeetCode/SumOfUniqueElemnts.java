package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElemnts {
    public static void main(String[] args) {
        int a[] = {1, 2, 3 ,2};
         System.out.println(sumOfUnique(a));
    }
    public  static int sumOfUnique(int[] nums) {
        //key as element and value as frequency
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }

        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           if(entry.getValue()==2){
               map.remove(entry.getKey(), entry.getValue());
           }
        }
        int sum =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            sum = sum + entry.getKey();
            }
        return sum;
        }


    }


