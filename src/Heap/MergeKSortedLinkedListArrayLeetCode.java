package Heap;

import java.util.PriorityQueue;

class Node {
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }Node(int val, Node next) { this.val = val; this.next = next; }
  }
public class MergeKSortedLinkedListArrayLeetCode {
    public Node mergeKLists(Node[] lists) {
        //Input: lists = [[1,4,5],[1,3,4],[2,6]]
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(Node head :lists){
            queue.add(head.val);
            head=head.next;
        }
        Node dummy = new Node(-1);
        Node head = dummy;
        while(!queue.isEmpty()){
            head.next = new Node(queue.remove());
            head = head.next;
        }
        return dummy.next;
    }
}
