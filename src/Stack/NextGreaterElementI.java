package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack= new Stack<>();
        for(int nums: nums2){
            while(!stack.isEmpty() && nums>stack.peek()){//nxt is gtr thn last
                map.put(stack.pop(), nums);
            }
            stack.push(nums);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]= map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

}
