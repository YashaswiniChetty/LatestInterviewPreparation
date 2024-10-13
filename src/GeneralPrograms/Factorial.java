package GeneralPrograms;

public class Factorial {

	public static void main(String[] args) {
	/*	int n=4,fact=1;
		while(n!=0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);*/
		
		int n=4,fact=1;
		fact=factorial(n);
		System.out.println(fact);
}

	private static int factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}
