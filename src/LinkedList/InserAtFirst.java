package LinkedList;

public class InserAtFirst {
    public static void main(String[] args) {
        Node root = null;
        CreatLinkedList creatLinkedList = new CreatLinkedList();
        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insertFirst(5, root);
        root = creatLinkedList.insertFirst(4, root);
        creatLinkedList.printList(root);
    }
}
