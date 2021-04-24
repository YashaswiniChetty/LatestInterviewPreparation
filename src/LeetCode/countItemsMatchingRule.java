package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int total = 0;
        int catagory=0;
        if(ruleKey.equals("type")){
            catagory = 0;
        }
        if(ruleKey.equals("color")){
            catagory = 1;
        }
        if(ruleKey.equals("name")){
            catagory = 2;
        }
        for(List<String> item: items){
            if(item.get(catagory).equals(ruleValue)){
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));
        list.add(new ArrayList<String>(Arrays.asList("phone","silver","iphone")));
        list.add(new ArrayList<String>(Arrays.asList("computer","silver","lenovo")));
        System.out.println(countMatches(list, "color", "silver"));

    }

}
