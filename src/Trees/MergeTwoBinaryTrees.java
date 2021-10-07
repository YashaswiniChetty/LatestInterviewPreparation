package Trees;
//617. Merge Two Binary Trees
//Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        root1.val+=root2.val;
        root1.left=mergeTrees(root1.left, root2.left);
        root1.right=mergeTrees(root1.right, root2.right);
        return root1;
    }
}

