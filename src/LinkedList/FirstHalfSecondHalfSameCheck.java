package LinkedList;

public class FirstHalfSecondHalfSameCheck {
    public static boolean IsSame(Node head){
        if(head==null || head.nxt==null){
            return false;
        }
        if(head!=null && head.nxt!=null && head.nxt.nxt==null)
            return head==head.nxt;
       Node slow=head;
       Node fast=head;
       while(fast.nxt!=null && fast.nxt.nxt!=null){
           slow=slow.nxt;
           fast=fast.nxt.nxt;
       }
        Node seconfHalf=slow.nxt;
       Node firstHalf=head;
       slow.nxt=null;
       while(seconfHalf!=null){
           if(firstHalf.i!=seconfHalf.i)
               return false;
           firstHalf=firstHalf.nxt;
           seconfHalf=seconfHalf.nxt;
       }
       return true;
    }

    public static void main(String[] args) {
        CreatLinkedList creatLinkedList = new CreatLinkedList();
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(5, root);
        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(5, root);

        System.out.println(IsSame(root));
    }
}
