package LinkedList;

import static LinkedList.DeleteLast.creatLinkedList;

public class CheckIfLoopExist {

    public  static boolean ifLoopExist(Node head){
        if(head==null){
            return false;
        }
        Node slow=head, fast=head;
        while( fast!=null && fast.nxt!=null){
            slow=slow.nxt;
            fast=fast.nxt.nxt;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(12, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(9, root);
        root.nxt.nxt.nxt.nxt.nxt=root.nxt.nxt;

System.out.println(CheckIfLoopExist.ifLoopExist(root));
    }
}
