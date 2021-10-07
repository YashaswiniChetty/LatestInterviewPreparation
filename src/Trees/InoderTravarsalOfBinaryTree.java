package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

     /*      1
           /   \
         2      3
       /  \
    + 4     5
*/
public class InoderTravarsalOfBinaryTree {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversalRecusrive(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }

        inorder(root);
        return list;
    }

    private void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

    public void InOrderIterative(TreeNode root){
        if(root==null){
            return ;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || stack.size()>0){
           while(curr!=null) {
               stack.push(curr);
               curr = curr.left;
           }
            curr=stack.pop();
            System.out.println(curr.val);
            curr=curr.right;
        }




    }
}
