package GeneralPrograms;

public class LargestOfTreeNo {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = -5;
		int num3 = 7;
		/*if (num1 >= num2 && num1 >= num3)
		   System.out.println( num1 + " is the maximum number.");
		else if (num2 >= num1 && num2 >= num3)
		   System.out.println( num2 + " is the maximum number.");
		else
		   System.out.println( num3 + " is the maximum number.");*/
	int 	big=num1>num2?num1:num2;
	big=big>num3?big:num3;
	System.out.println(big);
	

	}

}
