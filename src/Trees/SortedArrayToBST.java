package Trees;

public class SortedArrayToBST {
    //middle element in arry will be root and left elemets comes on left and right on right
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return constructBST(nums, 0, nums.length-1);
    }

    private TreeNode constructBST(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
      /*  mid = (start + end)/2
But there is problem with this approach, what if value of start or end or both is INT_MAX, it will cause integer overflow.*/
        int middlepoint=left+(right-left)/2;//
        TreeNode node = new TreeNode(nums[middlepoint]);
        node.left= constructBST(nums, left, middlepoint-1);
        node.right= constructBST(nums, middlepoint+1, right);

        return node;
    }
}
