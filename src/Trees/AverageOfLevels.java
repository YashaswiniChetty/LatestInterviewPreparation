package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        double level_sum=0;
        while(!queue.isEmpty()){
            level_sum=0;
            int size= queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                level_sum+=curr.val;
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            double avg=level_sum/size;
            result.add(avg);


        }
        return result;
    }


}
