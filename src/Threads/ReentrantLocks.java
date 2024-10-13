package Threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks extends Thread {
    ReentrantLock l= new ReentrantLock();
    @Override
    public void run() {
        l.lock();
        l.lock();
        //access resources
        System.out.println(" get hold count"+ l.getHoldCount() + Thread.currentThread());
        l.unlock();
        System.out.println(" get hold count"+ l.getHoldCount()+ Thread.currentThread());
        l.unlock();
        System.out.println(" get hold count"+ l.getHoldCount() + Thread.currentThread());

    }

    public static void main(String[] args) {
Thread thread1= new ReentrantLocks();
thread1.start();
        Thread thread2= new ReentrantLocks();
        thread2.start();

    }
}
