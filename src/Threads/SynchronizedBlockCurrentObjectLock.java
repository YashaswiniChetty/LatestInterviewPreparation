package Threads;
//passing this in synchronized(this) current object lock
//passing perticular object in synchronized(d) perticular object lock
//passing Display.class in synchronized(Display.class ) for perticular class// rugelar output
public class SynchronizedBlockCurrentObjectLock {
	public static void main(String[] args) {
		Disp d=new Disp();
		Mythread3 t1=new Mythread3(d,"dhoni");
		Mythread3 t2=new Mythread3(d,"yuraj");
		t1.start();
		t2.start();
		System.out.println("End of main method");
	}
	}
	class Mythread3 extends Thread{
		Disp d;
		String name;
		Mythread3(Disp d,String name){
			this.d=d;
			this.name=name;
			}
		public void run() {
			d.wish(name);
		}
	}

	class Disp{
		public synchronized void wish(String name) {
			
			;;;;;;;;;;;;;;;;;;;;;;;//i lakhs lines of code
			synchronized (this) {
				for(int i=0;i<10;i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println("I am Interrupted");
				}
				System.out.println(name);
			}
			}
			;;;;;;;;;;;;;;;;;;;;;;;//i lakhs lines of code
		}
	}
