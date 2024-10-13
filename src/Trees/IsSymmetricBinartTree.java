package Trees;

public class IsSymmetricBinartTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetricTree(root.left, root.right);
    }
    private boolean isSymmetricTree(TreeNode left, TreeNode right){
        if(left==null || right== null){
            return left==right;
        }
        if(left.val!=right.val)
            return false;
        return isSymmetricTree(left.left, right.right)&&isSymmetricTree(left.right, right.left);
    }
}
