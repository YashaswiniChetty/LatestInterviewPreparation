package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofNaryTree {
   /* public int maxDepth(Node root) {
        int depth =0;
        if(root==null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node curr = queue.remove();
                for(Node child: curr.children){
                    queue.add(child);
                }
            }
            depth++;
        }
return depth;
    }*/
}
