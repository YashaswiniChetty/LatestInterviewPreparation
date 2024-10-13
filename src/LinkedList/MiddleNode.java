package LinkedList;

public class MiddleNode {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(455, root);
        root = creatLinkedList.insert(9, root);
        root = creatLinkedList.insert(8, root);
        Node middle = middleMode(root);
        System.out.println(middle.i);
    }

    public static Node middleMode(Node node){
        if(node == null){
            return null;
        }

        Node slow = node;
        Node fast = node;
        while(fast!= null && fast.nxt!= null){
            slow = slow.nxt;
            fast = fast.nxt.nxt;
        }

        return slow;
    }
}
