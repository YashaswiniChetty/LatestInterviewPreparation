package Threads;

public class DaemonThreadExample  extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());//false as main thread is already started
		Thread.currentThread().setDaemon(true); // illegal Threadstate Exception once the thread is started we cannot set it to daemon 
        DaemonThreadExample t=new DaemonThreadExample();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		System.out.println(t.isDaemon());//true as thread is not started

	}

}
