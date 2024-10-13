package LinkedList;
//sorted linked list
public class DeleteDuplicates {
    public  static Node deleteDuplicates(Node head) {
        Node current = head;
        while(current!=null&& current.nxt!=null){
            if(current.nxt.i == current.i){
                current.nxt = current.nxt.nxt;
            }else{
                current = current.nxt;
            }
        }
        return head;
    }

    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(24, root);
        root = deleteDuplicates(root);
        creatLinkedList.printList(root);
    }
}
