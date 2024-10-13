package LinkedList;

public class PairWiseSwipeElements {
    public Node swipeElements(Node node){
        if(node==null || node.nxt==null){
            return node;
        }
       Node curr= node;
        while(curr!=null && curr.nxt!=null){
            int i= curr.i;
            curr.i=curr.nxt.i;
            curr.nxt.i=i;

            curr=curr.nxt.nxt;
        }

        return node;
    }

    public static void main(String[] args) {
        Node root = null;
        CreatLinkedList creatLinkedList = new CreatLinkedList();
        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(5, root);
        PairWiseSwipeElements pairWiseSwipeElements = new PairWiseSwipeElements();
        pairWiseSwipeElements.swipeElements(root);
        creatLinkedList.printList(root);
    }
}
