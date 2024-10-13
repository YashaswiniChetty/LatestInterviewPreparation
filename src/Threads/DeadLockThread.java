package Threads;

public class DeadLockThread extends Thread{
   static Thread mainThread;
   public void run() {
       System.out.println("Child thread starts waiting for main thread to complete");
       try{
           mainThread.join();
       }catch(InterruptedException e){

       }
       System.out.println("Child thread execution" +
               " completes");

   }

    public static void main(String[] args) throws InterruptedException {
        mainThread=Thread.currentThread();
        DeadLockThread childThread= new DeadLockThread();
        childThread.start();//starts child thread
        System.out.println("Main thread starts waiting for child thread to complete");
        childThread.join();
        System.out.println("Main thread execution" +
                " completes");
    }


}
