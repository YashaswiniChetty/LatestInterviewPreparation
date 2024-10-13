package GeneralPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

    String s1="Listen";
    String s2="silent";
    if(s1.length()==s2.length()) {
    	char[] ArrayS1 = s1.toLowerCase().toCharArray();  
        char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
      //  System.out.println();
        Arrays.sort(ArrayS2);  
       if( Arrays.equals(ArrayS1, ArrayS2)) {
    	   System.out.println("Anagram");
       }  
    }

	}
	
	 /*// remove all whitespaces and convert strings to lowercase
	  first  = first.replaceAll("\\s", "").toLowerCase();
	  second = second.replaceAll("\\s", "").toLowerCase();

	   check whether string lengths are equal or not, 
	     if unequal then not anagram 
	  if (first.length() != second.length())
	   return false;

	  // convert first string to char array
	  char[] firstArray = first.toCharArray();

	  // check whether each character of firstArray is present in second string
	  for (char c : firstArray)
	  {
	   int index = second.indexOf(c);

	   // indexOf function returns -1 if the character is not found 
	   if (index == -1)
	    return false;

	   // if character is present in second string, remove that character from second string
	   second  = second.substring(0,index) + second.substring(index+1, second.length());
	  }
	  return true;
	 }*/
     public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
             return false;
         }
         int count[] =new int[26];
         for(int i=0;i<s.length();i++){
             count[s.charAt(i)-'a']++;
             count[t.charAt(i)-'a']--;
         }
         for(int i:count){
             if(i!=0){
                 return false;
             }
         }
         return true;
     }
}
