package Threads;
//two obejcts two threads even though wish method is synchronised two thraeds have locks of two objects and starts executing wish method
//Irregular ouptput
public class SynchronizationDemoTwoObejctsLock {
	public static void main(String[] args) {
		
	
 Wishing w1=new Wishing();
 Wishing w2=new Wishing();
 Mythread1 t1=new  Mythread1(w1,"yashu");
 Mythread1 t2=new Mythread1(w2, "Abhi");
 t1.start();
 t2.start();
 }
 }
class Mythread1 extends Thread{
	Wishing w;
	String name;
	Mythread1(Wishing w,String name){
		this.w=w;
		this.name=name;
		}
	public void run() {
		w.wish(name);
	}
}
class Wishing{
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("GoodMorning:");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println("I am interrupted");
		}
		System.out.println(name);
		}
	}
}
