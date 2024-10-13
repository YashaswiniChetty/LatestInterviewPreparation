package GeneralPrograms;

import java.util.StringTokenizer;

public class NoOfWordsInString {
	public static void main(String[] args) {
		String s = "Alive is awesome";
		System.out.println(s.trim().split(" ").length);
		
	
		
		//String Tokenizer:
		
		/* String sf = "012ab567ab0123ab";

		    String delims = "ab ";

		    StringTokenizer st = new StringTokenizer(s, delims);
		            System.out.println("No of Token = " + st.countTokens());

		             while (st.hasMoreTokens())
		             {
		                 System.out.println(st.nextToken());
		             }

		     }*/
		
		 /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s=br.readLine();
	        ArrayList<Integer> al=new ArrayList<Integer>();  
	        ArrayList<String> splitResult=new ArrayList<String>();
	        for(int i=0;i<s.length();i++)
	            if(s.charAt(i)==' ')
	                al.add(i);
	        al.add(0, 0);
	        al.add(al.size(),s.length());
	        String[] words=new String[al.size()];
	        for(int j=0;j<=words.length-2;j++)
	                splitResult.add(s.substring(al.get(j),al.get(j+1)).trim());
	        System.out.println(splitResult);*/
	}

}
