package GeneralPrograms;

public class RemoveWhiteSpacesiInString {
	
	public static void main(String[] args) {
		/*String a="alive is yashu";
		
		System.out.println( a.replaceAll(" ",""));*/
		String str="Yashaswini sjsgj sasshhdasj";
		
		 char[] charArray = str.toCharArray();
	        
	        String stringWithoutSpaces = "";
	        
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
	            {
	                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
	            }
	        }
	        System.out.println("Input String : "+str);
	        
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);

		
	}

}
