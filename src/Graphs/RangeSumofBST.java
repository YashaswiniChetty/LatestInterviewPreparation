package Graphs;

import Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumofBST {
    /*public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null){
            return sum;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.remove();
            if(curr.val>=low && curr.val<=high){
                sum+=curr.val;
            }
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
        return sum;
    }*/

}
