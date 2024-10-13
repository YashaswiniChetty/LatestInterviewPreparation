package GeneralPrograms;

import java.util.HashMap;

public class MejorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])+1>nums.length/2){
                return nums[i];
            }else{
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }

        return +1;
    }
}
