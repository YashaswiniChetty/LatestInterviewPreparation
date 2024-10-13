package GeneralPrograms;

import java.util.Arrays;
//Time Complexity O(n)
public class CloseStrings {
    public   boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int []f1=new int[26];
        int []f2=new int[26];
        boolean [] v1= new boolean[26];
        boolean [] v2 =new boolean[26];
        for(int i=0;i<word1.length();i++){
            f1[word1.charAt(i)-'a']++;
            f2[word2.charAt(i)-'a']++;
            v1[word1.charAt(i)-'a']=true;
            v2[word2.charAt(i)-'a']=true;
        }
        System.out.println("f1 "+ Arrays.toString(f1));
        System.out.println("f2 "+ Arrays.toString(f2));
        Arrays.sort(f1);
        Arrays.sort(f2);
        System.out.println("f1 "+ Arrays.toString(f1));
        System.out.println("f2 "+ Arrays.toString(f2));
        System.out.println("v1 "+ Arrays.toString(v1));
        System.out.println("v2 "+ Arrays.toString(v2));
        return Arrays.equals(f1,f2) && Arrays.equals(v1,v2);
    }

    public static void main(String[] args) {
        CloseStrings c1= new CloseStrings();
        boolean close=c1.closeStrings("abcc", "bcaa");
        System.out.println(close);
    }
}
