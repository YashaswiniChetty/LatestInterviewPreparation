package Trees;

import java.util.ArrayList;
import java.util.List;

public class NaryPreOrder {
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();

        if(root==null)
            return list;


        getPreOrder(root,list);

        return list;
    }

    public void getPreOrder(Node node,List<Integer> list){

        if(node==null)
            return;


        list.add(node.val);
        List<Node> nodes=node.children;

        for(Node n:nodes){
            getPreOrder(n,list);
        }

    }
}



