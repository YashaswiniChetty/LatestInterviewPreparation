import org.omg.CORBA.Environment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoWiredTest {

    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(8);
        for(int i=0;i<list.size()-1;i++){
            list.add(i,list.get(list.size()-1));
            list.remove(list.size()-1);// 81233 //83123//83312//83321
        }
      /*  for(int i:list){
            System.out.println(i);
        }*/

    }
}
