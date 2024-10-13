package GeneralPrograms;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsInArraysTwostring {
	public static void main(String args[]) {
    String s1="Yashaswini";
    String s2="Yadagiri";
    char [] c1=s1.toCharArray();
    char [] c2=s2.toCharArray();
    Map<Character,String> map1 = new HashMap<Character,String>();
    Map <Character,String> commap= new HashMap<Character, String>();
    for(int j = 0; j < c1.length; j++)
    {
        map1.put(c1[j], "val"+j);
    }
    
    for(int i = 0; i < c2.length; i++)
    {
        if(!map1.containsKey(c2[i]))
            map1.put(c1[i], "val"+i);
        else
        	commap.put(c2[i], "val"+i);
    }
        System.out.println("Common Elements : " + commap.keySet());
 }

}
