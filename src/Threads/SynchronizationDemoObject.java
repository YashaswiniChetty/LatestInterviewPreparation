package Threads;
//calling wish method on display object with two threads
//Regular output because one thread wil have lock of object and run wish method
public class SynchronizationDemoObject {
public static void main(String[] args) {
	Display d=new Display();
	Mythread t1=new Mythread(d,"dhoni");
	Mythread t2=new Mythread(d,"yuraj");
	t1.start();
	t2.start();
}
}
class Mythread extends Thread{
	Display d;
	String name;
	Mythread(Display d,String name){
		this.d=d;
		this.name=name;
		}
	public void run() {
		d.wish(name);
	}
}

class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e) {
				System.out.println("I am Interrupted");
			}
			System.out.println(name);
		}
	}
}
