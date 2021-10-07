package Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderBinaryTree {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }

        post(root);
        return list;
    }

    private void post(TreeNode node){
        if(node==null){
            return ;
        }
        post(node.left);
        post(node.right);
        list.add(node.val);

    }
}
