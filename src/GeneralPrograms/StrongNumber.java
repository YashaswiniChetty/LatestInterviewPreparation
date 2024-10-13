package GeneralPrograms;

public class StrongNumber {

	public static void main(String[] args) {
	int n=145,sum=0,rem;
	int org=n;
	while(n!=0) {
		rem=n%10;
		sum=sum+fact(rem);
		n=n/10;
		
		
		
	}
if(sum==org) {
	System.out.println("strong");
}

	}

	private static int fact(int rem) {
	int fact=1;
	while(rem!=0) {
		fact=fact*rem;
		rem--;
	}
	return fact;
	}

}
