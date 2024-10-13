	package GeneralPrograms;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {
		int [] a=new int[] {1,2,3,4,5};
		int n=3;
        int temp;
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++)
        {
            temp = a[0];
             
            for (int j = 0; j < a.length-1; j++) 
            {
                a[j] = a[j+1];
            }
             
            a[a.length - 1] = temp;
        }
         
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");
         
        System.out.println(Arrays.toString(a));

	}

}
