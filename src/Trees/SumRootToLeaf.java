package Trees;

public class SumRootToLeaf {
    //
    public int sumRootToLeaf(TreeNode root) {

        return sum(root, 0);
    }
    public int sum(TreeNode node, int sum){
        if(node==null){
            return 0;
        }
        sum= (10*sum)+node.val;
        if(node.left==null && node.right==null){
            return sum;
        }
        return sum(node.left, sum)+sum(node.right, sum);
    }
}
