package GeneralPrograms;

public class InputIsInteger {

	public static void main(String[] args) {
		String input="1123";
		 try
		    {
		        Integer.parseInt(input);
		        System.out.println("Integer");
		    }
		    catch(NumberFormatException ex)
		    {
		        System.out.println("NOT integer");
		    }
		

	}

}
