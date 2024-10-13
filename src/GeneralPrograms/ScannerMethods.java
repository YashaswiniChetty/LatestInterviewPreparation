package GeneralPrograms;

import java.util.Scanner;

public class ScannerMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();//int input
	System.out.println(a);
	String s=sc.next(); //single word string
	System.out.println(s);
	String  s1=sc.nextLine();//line of strings
	System.out.println(s1);
	double d=sc.nextDouble();//double
	long l=sc.nextLong();//long
	
	//=================================
	while(sc.hasNextInt()){
	    int b=sc.nextInt();
	    System.out.println(a);
	}
	//======================================    
	  while (sc.hasNextLine()) 
      { System.out.println(sc.nextLine());
   }
	}

}
