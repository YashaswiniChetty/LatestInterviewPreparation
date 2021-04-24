package LinkedList;

public class SortLinkedList {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();

    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(455, root);
        root = creatLinkedList.insert(9, root);
    }

    public static Node mergeSort(Node node){
        if(node == null || node.nxt == null){
            return node;
        }

        Node middle = middleNode(node);
        Node secondHalf = middle.nxt;
        middle.nxt = null;// make first linkedlist tail to nulll
        return merge(mergeSort(node), mergeSort(secondHalf));

    }


    public static Node merge(Node a , Node b){
        return a;
    }
    public static Node middleNode(Node node){
        //jump a by one aand b by 2 so at last when b.nxt.nxt is null a is at middle postion
        if(node == null){
            return null;
        }

        Node a = node;
        Node b = node.nxt;
        while(b!= null && b.nxt!= null){
            a = a.nxt;
            b = b.nxt.nxt;
        }

        return a;

    }
}
