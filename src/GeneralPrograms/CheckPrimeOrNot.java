package GeneralPrograms;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		/*int num=5;
	    boolean isPrime=true;
	    int i=2;
		while(i<= num/2)
		{
		   if(num % i == 0)
		   {
			isPrime = false;
			break;
		   }
		   i++;
		}
		System.out.println(isPrime);*/

		int num=5;
		boolean isPrime=true;
		for(int i=2;i<num;i++){
            if(num%i==0){
               System.out.println("not prime");
               isPrime = false;
               break;
            }
	}
		if(isPrime)
		System.out.println("prime");

}}
