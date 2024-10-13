package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        if(root==null){
            return list;
        }

        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int max= Integer.MIN_VALUE;
            int size= queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr= queue.poll();
                max= Math.max(max, curr.val);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            list.add(max);
        }
        return list;

    }
}
