package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharactersInString {

	public static void main(String[] args) {
		String s="Yashaswini";
		Set set=new HashSet();
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(set.add(c[i])==false) {
				System.out.println(c[i]);
				set.remove(c[i]);
			}
		}
		System.out.println(set);
	}


}
