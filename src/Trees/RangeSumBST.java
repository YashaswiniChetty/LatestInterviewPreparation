package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Given the root node of a binary search tree and two integers low and high,
// return the sum of values of all nodes with a value in the inclusive range [low, high].
//Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//Output: 32
public class RangeSumBST {
   /* public int rangeSumBST(TreeNode root, int low, int high) {
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
        return sum;*/
    }

