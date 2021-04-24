package LinkedList;

public class DeleteLast {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();

    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(9, root);
        root = deleteLast(root);
        creatLinkedList.printList(root);
    }

    public static Node deleteLast(Node head){
        Node current = head;
        if(current == null || current.nxt == null){//0 nodes or one node
            return null;
        }

        while(current.nxt.nxt!= null){
            current = current.nxt;
        }
        current.nxt = null;
        return  head;
    }
}
