package LinkedList;

public class RotateClockWiseKth {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {


    }

    public static Node clockWise(int k , Node head){
        if(head == null || k<0){
            return head;
        }

        int size = creatLinkedList.linkedlIstLength(head);
        k = k % size;
        if(k == 0)
            return head;

        Node temp = head;
        int i =1;
        while(i< size-k){

        }
        return head;
    }
}
