package Threads;

/*public class ThreadWaitNotify {


	}

}*/
public class ThreadWaitNotify extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total = total + i;

            }
            this.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadWaitNotify t = new ThreadWaitNotify();
        t.start();
        synchronized (t) {
            t.wait();
        }
        System.out.println(t.total);

    }
}
