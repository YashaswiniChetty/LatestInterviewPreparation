package GeneralPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveGivenCharInString {

	public static void main(String[] args) {
		String s="Yashaswini";
		char [] c=s.toCharArray();
		ArrayList<Character> l=new ArrayList<Character>();
		Character ch=new Character('Y');
		for(int i=0;i<c.length;i++) {
		l.add(c[i]);
		}
		for(int i=0;i<l.size();i++) {
			if(l.contains(ch)) {
				l.remove(i);
			}
		}
System.out.println(l);
	}

}
