package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfNaryTree {
    public int maxDepth(Node root) {
        int depth=0;
        if(root==null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                for(Node child: curr.children){
                    queue.add(child);
                }
            }
            depth++;
        }
        return depth;
    }
}
