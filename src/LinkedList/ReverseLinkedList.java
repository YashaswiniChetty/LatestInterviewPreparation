package LinkedList;

public class ReverseLinkedList {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(9, root);
        root = reverseLinkedList(root);
        creatLinkedList.printList(root);
    }

    public static Node reverseLinkedList(Node head){
        if(head == null)
            return null;

        if(head.nxt == null)
            return head;

        Node current = head;
        Node prev = null;
        Node nxt = null;
        while(current != null){
            nxt = current.nxt;
            current.nxt = prev;
            prev = current;
            current = nxt;
        }
        return  prev;

    }
}
