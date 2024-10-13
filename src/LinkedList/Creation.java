package LinkedList;

class CreatLinkedList {
    public Node insert(int i, Node node) {
        if (node == null) {
            return getNewNode(i);
        } else {
            node.nxt = insert(i, node.nxt);
        }
        return node;
    }

    public Node getNewNode(int i) {
        Node node = new Node();
        node.i = i;
        node.nxt = null;
        return node;
    }

    public void printList(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.i + " -> ");
        printList(node.nxt);
    }

    public Node insertFirst(int i, Node node) {
        Node firstNode = getNewNode(i);
        firstNode.nxt = node;
        return firstNode; //which is root
    }

    public int linkedlIstLength(Node node) {
        if (node == null) {
            return 0;
        }
        return 1+linkedlIstLength(node.nxt);

    }

    public Node insertLast(int i, Node node) {
        Node lastNode = new Node(i);
        if (node == null) {
            node = lastNode;
            return node;
        }
        Node current = node;
       /* while (current.nxt != null) {
            current = current.nxt;
        }
        current.nxt = lastNode;

        return node;*/
       while(current.nxt.nxt!=null){
           current=current.nxt;
       }
       current.nxt.nxt=lastNode;
       return node;
    }

}

public class Creation {
    public static void main(String[] args) {
        Node root = null;
        CreatLinkedList creatLinkedList = new CreatLinkedList();
        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(7, root);
        creatLinkedList.printList(root);
        System.out.println();
        System.out.println(creatLinkedList.linkedlIstLength(root));
    }
}


