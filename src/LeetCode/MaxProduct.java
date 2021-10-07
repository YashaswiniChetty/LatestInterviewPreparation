package LeetCode;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    int prd=(nums[i]-1)*(nums[j]-1);
                    max=Math.max(prd, max);
                }
            }
        }
        return max;
    }
}
