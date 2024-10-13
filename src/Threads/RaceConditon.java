package Threads;

public class RaceConditon extends Thread {
    private static int count;
    RaceConditon(int count){
      this.count=count;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ "  "+ this.count);
            count++;
        }

    }

    public static void main(String[] args) {
        count=9;
        Thread raceConditon=new RaceConditon(19);
        raceConditon.start();
        for(int i=0;i<9;i++){
            System.out.println(Thread.currentThread().getName()+"  main threadrunning"+ count);
            count++;

        }
    }
}
