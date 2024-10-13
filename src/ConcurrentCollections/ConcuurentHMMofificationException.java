package ConcurrentCollections;

import javax.swing.text.AsyncBoxView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcuurentHMMofificationException extends Thread {
    static ConcurrentHashMap map = new ConcurrentHashMap();
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
        }
        System.out.println("Child Thread Updating");
        map.put(3,"c");

    }

    public static void main(String[] args) {
        map.put(1,"a");
        map.put(2,"b");
        ConcuurentHMMofificationException thread= new ConcuurentHMMofificationException();
        thread.start();
        Set s1= map.keySet();
        Iterator iterator =s1.iterator();
        while(iterator.hasNext()){
            Integer i1= (Integer)iterator.next();
            if(i1== 3){
                System.out.println("main Thread Updating");
                map.remove(3,"c");
            }
        }
        System.out.println(map);
    }

}
