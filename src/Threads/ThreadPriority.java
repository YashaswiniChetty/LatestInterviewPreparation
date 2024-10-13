package Threads;
//based on thread scheduler output will come

public class ThreadPriority extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("child thread"+ Thread.currentThread().getPriority());
		}
	}
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        ThreadPriority t1 = new ThreadPriority();
        t1.setPriority(10);
        t1.start();
    }
}
