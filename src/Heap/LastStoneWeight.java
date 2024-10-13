package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>((i1, i2)->i2-i1);
        for(int stone:stones){
            que.offer(stone);
        }
        while(que.size()>1){
            int first = que.poll();
            int second =que.poll();
            if(first!=second){
                que.offer(first -second);
            }
        }
        return que.isEmpty()? 0 : que.poll();

    }
}
