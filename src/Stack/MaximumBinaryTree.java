package Stack;

import java.util.Stack;

public class MaximumBinaryTree {
    public  static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            TreeNode curr = new TreeNode(nums[i]);
            // if the peek element is smaller than current number,
            // then it would be the left child of current number then pop it.
            while (!stack.isEmpty() && nums[i] > stack.peek().val) {
                curr.left = stack.peek();
                stack.pop();
            }
            // the bigger number's (if exist) right chhild is current number.
            if (!stack.isEmpty()) {
                stack.peek().right = curr;
            }
            stack.push(curr);
        }

        // get the buttom element of stack (the largest one)
        TreeNode rst = null;
        while (!stack.isEmpty()) {
            rst = stack.pop();
        }
        return rst;
    }

    public static void main(String[] args) {
        int nums[]= {3,2,1,6,0,5};
        constructMaximumBinaryTree(nums);
    }
}
