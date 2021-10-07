package Trees;

import java.util.Stack;

public class isvalidBST {
    TreeNode root;
    public boolean isValidBST(TreeNode root) {

        if(root==null){
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        double left_child_val= -Double.MAX_VALUE;
        TreeNode curr= root;
        while(curr!=null || !stack.isEmpty() ){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            if(curr.val<=left_child_val){
                return false;
            }
            left_child_val=curr.val;
            curr=curr.right;
        }
        return true;
    }

    public static void main(String args[])
    {
        isvalidBST tree = new isvalidBST();
        tree.root = new TreeNode(5);
        tree.root.right = new TreeNode(4);
        tree.root.left = new TreeNode(1);

        System.out.println("is valid BST "+ tree.isValidBST(tree.root));
    }
}
