package LeetCode;

public class MaximumSubarray {

    public static void main(String[] args) {
        int a[] = {-1, 2};
        int max = maxSubArray(a);
        System.out.println(max);
    }

    public static int maxSubArray(int a[]){
        int max_end = a[0];
        int  max_curr = a[0];
        for(int i =1; i< a.length;i++){
            max_curr = Math.max(max_curr + a[i], a[i]);

            if(max_end< max_curr){
                max_end = max_curr;
            }
            if(max_curr < 0){
                max_curr = 0;
            }
        }
        return max_end;
    }
}
