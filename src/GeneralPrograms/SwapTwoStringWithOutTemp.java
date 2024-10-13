	package GeneralPrograms;
public class SwapTwoStringWithOutTemp {
public static void main(String[] args) {
		String a="Love";
		String b="you";
		a=a+b;
		//System.out.println(a.length()-b.length());
		b=a.substring(0, (a.length()-b.length()));
		//System.out.println(b);
	    a=a.substring(b.length());
		//System.out.println(a);
		System.out.println(a +" "+b);
		//output  you love
		}
}
