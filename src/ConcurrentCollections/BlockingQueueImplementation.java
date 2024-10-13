package ConcurrentCollections;

import java.util.LinkedList;
import java.util.List;

/*BlockingQueue interface supports flow control (in addition to queue) by introducing blocking if either BlockingQueue is full or empty. A thread trying to enqueue an element in a full queue is blocked until some other thread makes space in the queue, either by dequeuing one or more elements or clearing the queue completely. Similarly, it blocks a thread trying to delete from an empty queue until some other threads insert an item.
        BlockingQueue does not accept a null value. If we try to enqueue the null item, then it throws NullPointerException.*/
// add elements at the end of the deque.
//remove at the start of queue
//// To check if the deque contains 22
//        if (lbdq.contains(22))
//
// Using element() to retrieve the head of the deque
    //    int head = lbdq.element();
/*BlockingQueue<String> queue
        = new ArrayBlockingQueue<String>(capacity);*/
/*BlockingQueue<Integer> BQ
        = new LinkedBlockingDeque<Integer>();*/
//Java BlockingQueue interface implementations are thread-safe. All methods of BlockingQueue are atomic in nature and use internal locks or other forms of concurrency control
public class BlockingQueueImplementation<T> {
    private List<T> queue= new LinkedList<T>();
    private int limit =10;

    public synchronized void enqueue( T item){
        while (queue.size() == limit){
            try{
                wait();
            }catch (InterruptedException e ){

            }
        }
        if(queue.isEmpty()){
            notifyAll();
        }
        queue.add(item);
    }

    public synchronized T dequeue(){
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.size() == limit) {
            notifyAll();
        }
        return queue.remove(0);
    }

}
