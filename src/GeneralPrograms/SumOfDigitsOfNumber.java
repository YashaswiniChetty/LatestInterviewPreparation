package GeneralPrograms;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int n=129	,sum=0,rem;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);

	}

}
