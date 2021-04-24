package LinkedList;

public class InsertAtSpecificPosition {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();

    public static Node insertAtSpecific(int i, Node head, int position){
  /*   Node newNode = creatLinkedList.getNewNode(i);
     Node current_node = head;
     int index = 0;
     int len = creatLinkedList.linkedlIstLength(head);
     System.out.println("Length"+ len);
        if(position<0 || position > len) {
            return;
        }
        if(position==0){
            //inser at first
            Node n = newNode;
            n.nxt = head;
            head = n;
            len++;
        }
        if(position==len){
            //insert at last
            creatLinkedList.insertLast(i, head);
        }else{
            while(index < position-1){
                current_node = current_node.nxt;
                index++;
            }
            newNode.nxt = current_node.nxt;
            current_node.nxt = newNode;
        }*/

        Node current_node = head;
        int index = 0;
        int len = linkedLisstLength(head);
        if(position<0 || position > len) {
            return head;
        }
        if(position==0){
            //inser at first
            Node n = new Node(i);
            n.nxt = head;
            head = n;
            return head;
        }
        if(position==len){
            //insert at the last
          return  insertLast(i, head);
        }else{
            //insert in some position
            Node newNode = new Node(i);
            while(index < position -1 ){
                current_node = current_node.nxt;
                index++ ;
            }
            newNode.nxt = current_node.nxt;
            current_node.nxt = newNode;
            return head;
        }
    }

    public static int linkedLisstLength(Node node) {
        if (node == null) {
            return 0;
        }
        return 1+linkedLisstLength(node.nxt);

    }

    public static Node insertLast(int i, Node node) {
        Node lastNode = new Node(i);
        if(node == null){
            node = lastNode;
            return node;
        }
        Node current = node;
        while(current.nxt!= null){
            current = current.nxt;
        }
        current.nxt = lastNode;

        return node;
    }

    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = insertAtSpecific(5, root, 3);
        creatLinkedList.printList(root);

    }
}
