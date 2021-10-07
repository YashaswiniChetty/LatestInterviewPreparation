package Trees;

import java.util.ArrayList;
import java.util.List;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null){
            if(root.left.val!=root.val){
                return false;
            }
        }
        if(root.right!=null){
            if(root.right.val!=root.val){
                return false;
            }
        }
        return isUnivalTree(root.left)&& isUnivalTree(root.right);
    }
}
