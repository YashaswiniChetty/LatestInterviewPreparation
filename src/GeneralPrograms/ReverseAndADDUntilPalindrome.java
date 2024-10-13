package GeneralPrograms;

public class ReverseAndADDUntilPalindrome {

	public static void main(String[] args) {
		ReverseandAdd(7325);

	}

	private static void ReverseandAdd(int num) {
		int rev=Reverse(num);
		if(isPalindrome(num)) {
			System.out.println("Num is palindrome");
		}
		else {
			while(!isPalindrome(num)) {
		int sum=0;
		sum=num+rev;
		num=sum;
		System.out.println(num+" + "+rev+" = "+sum);
			}
		}
	}

	private static boolean isPalindrome(int num) {
		int rev = Reverse(num);
        
        if(rev == num)
        {
            return true;
        }
        else
        {
            return false;
        }
	}

	private static int Reverse(int num) {
		int rem=0;
		int rev=0;
		while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		return num;
	}

}
