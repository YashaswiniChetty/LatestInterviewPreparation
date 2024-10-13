package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewBST {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();


            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                if(i==0)
                    list.add(curr.val);

                if (curr.right != null) {
                    queue.offer(curr.right);
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
            }


        }

        return list;
    }
}
