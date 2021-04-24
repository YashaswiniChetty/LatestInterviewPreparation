package LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
       char[]  chars = {'a','a','b','b','c','c','c'};
       System.out.println(compress(chars));
    }

    public static  int compress(char[] chars) {
        String str = new String(chars);
        //in whatever way we iterate in same order, in same order we can retrive from map
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1 );
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb);
        return sb.length();
    }
}
