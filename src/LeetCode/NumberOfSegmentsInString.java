package LeetCode;

import java.awt.datatransfer.StringSelection;

public class NumberOfSegmentsInString {
    public static void main(String[] args) {
        String s = "hello shhs sshjs sjsjjs";
        System.out.println(count(s));
    }

    public static int count(String s){
        int count =0;
        for(int i=0;i<s.length(); i++){
            if((i==0 || s.charAt(i-1)==' ') && s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
