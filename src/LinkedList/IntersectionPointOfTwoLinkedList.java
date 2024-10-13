package LinkedList;


import java.util.HashSet;

//O(Count1+Count2) time complexity Space complexityO(1)
public class IntersectionPointOfTwoLinkedList {

    public static void main(String[] args) {



    }


        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA== null || headB==null){
                return null;
            }
            HashSet<ListNode> set= new HashSet<>();
            while(headA!=null){
                set.add(headA);
                headA=headA.next;
            }
            while(headB!=null){
                if(set.contains(headB)){
                    return headB;
                }
                headB=headB.next;
            }

            return null;
        }
    }

