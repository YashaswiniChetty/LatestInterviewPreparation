package Trees;

import java.util.ArrayList;
import java.util.List;

public class NaryPostOrder {
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();

        if(root==null)
            return list;


        getPostOrder(root,list);

        return list;
    }

    public void getPostOrder(Node node,List<Integer> list){

        if(node==null)
            return;



        List<Node> nodes=node.children;

        for(Node n:nodes){
            getPostOrder(n,list);
        }
        list.add(node.val);
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
