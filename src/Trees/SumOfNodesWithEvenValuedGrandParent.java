package Trees;

public class SumOfNodesWithEvenValuedGrandParent {
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null){
            return 0;
        }
        TraverseTree(root, false, false);
        return sum;
    }

    public void TraverseTree(TreeNode node , boolean parent, boolean grandp){
        if(node==null){
            return;
        }
        if(grandp){
            sum+=node.val;
        }
        TraverseTree(node.left, node.val%2==0, parent);
        TraverseTree(node.right, node.val%2==0, parent);

    }
}
