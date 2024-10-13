package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> charCountMap = new HashMap<Integer, Integer>();
        for (int c : nums) {
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            int value=(Integer)entry.getValue();
            int key=(Integer)entry.getKey();
            if(value==1){
                return key;
            }
        }
        return -1;
    }
}
