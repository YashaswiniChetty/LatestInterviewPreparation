package GeneralPrograms;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsInArraysTwoIntegers {
	public static void main(String args[])
    {// without map, take 1 1st element of 1st array in first for loop and the take array2 in j loopp check 1st with all elememts of j and print
        Integer[] array1 = {1, 2, 3, 4, 5, 7, 9};
        Integer[] array2 = {3, 4, 5, 6, 7, 10, 40, 2};
       
        Map map1 = new HashMap();
        Map commonElementsMap = new HashMap();
        for(int i = 0; i < array1.length; i++)
        {
            map1.put(array1[i], "val"+i);
        }
        
        for(int i = 0; i < array2.length; i++)
        {
            if(!map1.containsKey(array2[i]))
                map1.put(array1[i], i);
            else
                commonElementsMap.put(array2[i], "val"+i);
        }
            System.out.println("Common Elements : " + commonElementsMap.keySet());
     }
}
