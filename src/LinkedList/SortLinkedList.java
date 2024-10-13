package LinkedList;

public class SortLinkedList {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();

    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(455, root);
        root = creatLinkedList.insert(9, root);
        SortLinkedList sortLinkedList= new SortLinkedList();
        Node djkh=sortLinkedList.mergeSort(root);
        creatLinkedList.printList(djkh);

    }

    public  Node mergeSort(Node node){
        if(node == null || node.nxt == null){
            return node;
        }

        Node middle = middleNode(node);
        Node secondHalf = middle.nxt;
        middle.nxt = null;// make first linkedlist tail to nulll
        return merge(mergeSort(node), mergeSort(secondHalf));

    }


    public static Node merge(Node a , Node b){
        Node temp = new Node();
        Node finalList= temp;
        while(a!=null && b!=null){
            if(a.i<b.i){
                temp.nxt=a;
                a=a.nxt;
            }else{
                temp.nxt=b;
                b=b.nxt;
            }
            temp=temp.nxt;
        }
     temp.nxt=a==null?b : a;
        return finalList.nxt;
    }
    public static Node middleNode(Node node){
        //jump a by one aand b by 2 so at last when b.nxt.nxt is null a is at middle postion
        if(node == null && node.nxt==null){
            return node;
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
