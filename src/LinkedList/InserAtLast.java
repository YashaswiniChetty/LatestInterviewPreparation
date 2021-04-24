package LinkedList;

public class InserAtLast {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insertLast(9, root);
        root = creatLinkedList.insert(8, root);

        creatLinkedList.printList(root);
    }
}
