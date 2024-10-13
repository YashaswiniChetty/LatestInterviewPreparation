import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrimeNum {
    public static void main(String[] args) {
      //  count the number of words in a string
      //  Input:"This this is  done by cat is cat"
      //  Output:{cat=2, by=1, this=1, This=1, is=2, done=1}

        String s= "This this is done by cat is cat";
        String [] arr= s.split(" ");
        Map<String, Integer> map= new HashMap<>();
        for(String s1: arr){
            map.put(s1, map.getOrDefault(s1,0)+1);
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()){

            System.out.println(entry);
        }
    }

}



