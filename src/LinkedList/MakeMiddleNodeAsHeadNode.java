package LinkedList;

public class MakeMiddleNodeAsHeadNode {
    public Node makeMiddleNodeAsHead(Node head){
        if(head==null || head.nxt==null){
            return head;
        }
        Node slow, fast, prev,node;
        slow=fast=prev=node=head;
        while(fast!=null && fast.nxt!=null){
            prev=slow;
            slow=slow.nxt;
            fast=fast.nxt.nxt;
        }
        prev.nxt=slow.nxt;
        slow.nxt=node;
        return slow;

    }

    public static void main(String[] args) {
        Node root = null;
        CreatLinkedList creatLinkedList = new CreatLinkedList();
        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(5, root);
        root = creatLinkedList.insert(4, root);
        root = creatLinkedList.insert(9, root);
        MakeMiddleNodeAsHeadNode insert= new MakeMiddleNodeAsHeadNode();
        Node middle= insert.makeMiddleNodeAsHead(root);
        creatLinkedList.printList(middle);
    }
}
