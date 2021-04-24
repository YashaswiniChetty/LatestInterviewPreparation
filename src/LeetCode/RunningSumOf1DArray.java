package LeetCode;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 6, 4};
        System.out.println(runningSum(a));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;

        }
        return nums;
    }
}
