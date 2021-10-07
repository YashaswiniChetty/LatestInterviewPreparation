package Trees;

public class MaxDepthOfBinaryTree {
    TreeNode root;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return 1+maxDepth(root.right);
        }
        if(root.right==null){
            return 1+maxDepth(root.left);
        }
        return Math.max(maxDepth(root.left),  maxDepth(root.right))+1;
    }

    public static void main(String args[])
    {
        MaxDepthOfBinaryTree tree = new MaxDepthOfBinaryTree();
        tree.root = new TreeNode(3);
        tree.root.right = new TreeNode(20);
        tree.root.left = new TreeNode(9);
        tree.root.right.right = new TreeNode(15);
        tree.root.right.left = new TreeNode(7);



        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.maxDepth(tree.root));
    }
}
