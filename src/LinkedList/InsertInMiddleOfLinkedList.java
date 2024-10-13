package LinkedList;

public class InsertInMiddleOfLinkedList {
    public Node insertMiddleNode(Node head, int i){
        if(head==null){
            return new Node(i);
        }
        if(head.nxt==null){
            head.nxt=new Node(i);
        }
        Node slow, fast, prev;
        slow=fast=prev=head;
        while(fast!=null && fast.nxt!=null){
            prev=slow;
            slow=slow.nxt;
            fast=fast.nxt.nxt;
        }
      Node node = new Node(i);
        prev.nxt=node;
        node.nxt=slow;
         return  head;
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
        InsertInMiddleOfLinkedList insert= new InsertInMiddleOfLinkedList();
        insert.insertMiddleNode(root, 7);
        creatLinkedList.printList(root);
    }
}
