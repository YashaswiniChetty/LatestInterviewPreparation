package LinkedList;

public class DeleteMiddleNode {

    public Node deleteMiddleNode(Node head){
        if(head==null || head.nxt==null){
            return head;
        }
        Node slow, fast, prev;
        slow=fast=prev=head;
        while(fast!=null && fast.nxt!=null){
            prev=slow;
            slow=slow.nxt;
            fast=fast.nxt.nxt;
        }
        prev.nxt=slow.nxt;
        return head;
    }

    public static void main(String[] args) {
        Node root = null;
        CreatLinkedList creatLinkedList = new CreatLinkedList();
        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(5, root);
        root = creatLinkedList.insert(4, root);
        DeleteMiddleNode deleteMiddleNode= new DeleteMiddleNode();
        deleteMiddleNode.deleteMiddleNode(root);
        creatLinkedList.printList(root);
    }
}
