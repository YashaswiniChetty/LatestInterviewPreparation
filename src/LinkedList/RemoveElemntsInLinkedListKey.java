package LinkedList;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class RemoveElemntsInLinkedListKey {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;

        ListNode current=head;
        ListNode tmp=null;

        while(current!=null){
            if(current.val == val){

                if(tmp==null)
                {
                    head=head.next;
                    current=head;
                    continue;
                }
                else{
                    tmp.next=current.next;
                    current=tmp;
                }
            }
            tmp=current;
            if(current!=null)
                current=current.next;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
