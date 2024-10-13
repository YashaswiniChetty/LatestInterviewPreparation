package Trees;

public class ConstructBSTFromSortedArray {
    public TreeNode BSTFromArray(int[] nums){
        if(nums.length==0)
            return null;
        return constructBSTFromSortedArray(nums, 0, nums.length-1);
    }

    public TreeNode constructBSTFromSortedArray(int[] nums, int left, int right) {
        if(left>right){
            return null;
        }
        int middle= left+(right-left)/nums.length;
        TreeNode node = new TreeNode(nums[middle]);
        node.left=constructBSTFromSortedArray(nums, left, middle-1);
        node.right=constructBSTFromSortedArray(nums, middle+1, right);
        return node;
    }
}
