package Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class findDupli {

    public static void main(String[] args) {
        String s1="aebbbaaa";
        Map<Character, Integer> map =  new LinkedHashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>2){

                System.out.println(entry);
            }
        }
    }
}

