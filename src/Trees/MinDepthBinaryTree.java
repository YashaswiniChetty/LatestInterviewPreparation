package Trees;

public class MinDepthBinaryTree {
    TreeNode root;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return 1+minDepth(root.right);
        }
        if(root.right==null){
            return 1+minDepth(root.left);
        }

        return Math.min(minDepth(root.left),  minDepth(root.right))+1;
    }

    public static void main(String args[])
    {
        MinDepthBinaryTree tree = new MinDepthBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.minDepth(tree.root));
    }
}
