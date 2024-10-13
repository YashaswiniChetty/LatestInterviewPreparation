package Threads;

public class ThreadJoin2 {

	public static void main(String[] args) {
		// ChildThreadToWaituntilMainThreadCompletes
		//if both threads call both method on each other , then dead lock
		childThread.mt=Thread.currentThread();
		childThread t=new  childThread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}

	}

}
class childThread extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		}
		catch(InterruptedException e) {
			
		}
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}
