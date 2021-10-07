package Trees;

public class BalanvedBinaryTree {
    TreeNode root;
    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        /* Get the height of left and right sub trees */
        lh = height(root.left);
        rh = height(root.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }

    private int height(TreeNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String args[])
    {
        BalanvedBinaryTree tree = new BalanvedBinaryTree();
        tree.root = new TreeNode(3);
        tree.root.right = new TreeNode(20);
        tree.root.left = new TreeNode(9);
        tree.root.right.right = new TreeNode(15);
        tree.root.right.left = new TreeNode(7);



        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.isBalanced(tree.root));
    }
}
