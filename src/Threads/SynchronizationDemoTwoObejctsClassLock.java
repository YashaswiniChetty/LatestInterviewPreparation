package Threads;
//two obejcts two threads but  wish method is  static synchronised,  so class level lock, one thread
//gets the class lock and starts executing, so t2 will wait until t1 completes
//Regular ouptput
public class SynchronizationDemoTwoObejctsClassLock {
	public static void main(String[] args) {
		
		
		 Wish w1=new Wish();
		 Wish w2=new Wish();
		 Mythread2 t1=new  Mythread2(w1,"yashu");
		 Mythread2 t2=new Mythread2(w2, "Abhi");
		 t1.start();
		 t2.start();
		 }
		 }
		class Mythread2 extends Thread{
			Wish w;
			String name;
			Mythread2(Wish w,String name){
				this.w=w;
				this.name=name;
				}
			public void run() {
				w.wish(name);
			}
		}
		class Wish{
			public  static synchronized void wish(String name) {
				
				for(int i=0;i<10;i++) {
					System.out.print("GoodMorning:");
				try {
					Thread.sleep(200);
				}
				catch(InterruptedException e) {
					System.out.println("I am interrupted");
				}
				System.out.println(name);
				}
				
			}
		}

