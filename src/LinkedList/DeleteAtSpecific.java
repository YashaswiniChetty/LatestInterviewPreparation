package LinkedList;

public class DeleteAtSpecific {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(9, root);
        root = deleteAtSpecific(root, 2);
        creatLinkedList.printList(root);
    }

    public static Node deleteAtSpecific(Node head, int position){
        int len = creatLinkedList.linkedlIstLength(head);
        System.out.println(len);
       int  index =0;
        Node current = head;
        if(head == null)
          return null;
        if(position<0 || position >= len){
            return head;
        }
        if(position ==0 ){
            return current.nxt;
        }

            while(index< position-1){
                current = current.nxt;
                index++ ;
            }
            current.nxt = current.nxt.nxt;
            return head;


    }
}
