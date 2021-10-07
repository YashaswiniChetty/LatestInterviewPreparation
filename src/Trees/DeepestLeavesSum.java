package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level_sum=0;
        while(!que.isEmpty()){
            level_sum=0;
            int size =que.size();
            for(int i=0;i<size;i++){
                TreeNode curr = que.poll();
                level_sum+=curr.val;
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
                }
            }

        }
        return level_sum;
    }
}
