package Trie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWord {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>();
        set.addAll(dictionary);
        String Words[]=sentence.split(" ");
        String replaceWords="";
        for(int i=0;i<Words.length;i++)
            for(int j=0;j<Words[i].length();j++)

                if(set.contains(Words[i].substring(0,j+1))){
                    // Convert words into its abbreviation format
                    Words[i]=Words[i].substring(0,j+1);
                    break;
                }
        // Sentence after synthesizing ReplaceWords
        for(int i=0;i<Words.length;i++)
            replaceWords+=(Words[i]+" ");
        return replaceWords.substring(0,replaceWords.length()-1);
    }
}
