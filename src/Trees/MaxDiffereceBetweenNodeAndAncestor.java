package Trees;

public class MaxDiffereceBetweenNodeAndAncestor {
//Time Complexity O(N) since we visit all nodes
    //Space complexity O(N)
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        return helper(root, root.val, root.val);
    }

    private int helper(TreeNode node, int cmax, int cmin) {
        if(node==null){
            return cmax-cmin;
        }
        cmax=Math.max(node.val, cmax);
        cmin=Math.min(node.val,cmin );
        int left= helper(node.left, cmax, cmin);
        int right=helper(node.right, cmax, cmin);
        return Math.max(left , right);
    }
}
