package Trees;

public class InvertBinaryTree {
    TreeNode root;
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right=left;
        root.left=right;

        return root;
    }

    public static void main(String args[])
    {
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left = new TreeNode(1);
        /*tree.root.right.right = new TreeNode(15);
        tree.root.right.left = new TreeNode(7);*/



        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.invertTree(tree.root));
    }
}

