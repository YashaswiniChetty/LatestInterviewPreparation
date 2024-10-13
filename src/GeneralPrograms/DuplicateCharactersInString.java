package GeneralPrograms;

import java.util.HashSet;
import java.util.Set;
//find and remove duplicates programs are same except set.remove(element);
public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String s="Yashaswini";
		Set set=new HashSet();
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(set.add(c[i])==false) {
				System.out.println(c[i]);
			}
		}
	}

}
