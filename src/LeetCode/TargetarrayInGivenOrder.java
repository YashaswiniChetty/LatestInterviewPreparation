package LeetCode;

import java.util.ArrayList;

public class TargetarrayInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i], nums[i]);
        }
        int [] op=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            op[i]=list.get(i);
        }
        return op;
    }
}
