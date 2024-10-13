package GeneralPrograms;

public class SecongLargestElementInArray {

	public static void main(String[] args) {
		int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
		int max = a[0]; 
		int seconglargest = 0;
		
		 

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) 
			{   seconglargest= max;
				max = a[i];
			}
			
			
		}
		System.out.println(max);
		System.out.println(seconglargest);
	

	}

}
