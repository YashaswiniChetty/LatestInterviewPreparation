package GeneralPrograms;

import java.util.Arrays;

public class RightRotateArray {

	public static void main(String[] args) {
		int []a=new int[] {1,2,3,4,5};
		int n=3;
		 System.out.println("Input Array Before Rotation :");
         
	        System.out.println(Arrays.toString(a));
	         
	        int temp;
	         
	        for (int i = 1; i <= n; i++) 
	        { 
	            temp = a[a.length-1]; 
	             
	            for (int j = a.length-1; j > 0; j--) 
	            {
	                a[j] = a[j-1];
	            }
	             
	            a[0] = temp;
	        }
	         
	        System.out.println("Input Array After Right Rotation By "+n+" Positions :");
	         
	        System.out.println(Arrays.toString(a));

	}

}
