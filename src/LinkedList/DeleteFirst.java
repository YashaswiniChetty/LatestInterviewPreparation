package LinkedList;

public class DeleteFirst {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(9, root);
        root = deleteFirst(root);
        creatLinkedList.printList(root);

    }

    public static Node deleteFirst(Node head){
        if(head == null){
            return null;
        }
     return head.nxt;
    }
}
