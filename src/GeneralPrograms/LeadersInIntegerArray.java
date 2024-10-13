package GeneralPrograms;

public class LeadersInIntegerArray {

	public static void main(String[] args) {
		int [] a=new int[] {12, 9, 7, 14, 8, 10, 3};
		  for (int i = 0; i < a.length; i++)
	        {
	            boolean flag = true;
	 
	            for (int j = i+1; j < a.length; j++)
	            {
	                if (a[j] > a[i])
	                {
	                    flag = false;
	 
	                    break;
	                }
	            }
	 
	            if (flag)
	            {
	                System.out.println(a[i]);
	            }

	}
	}
}

