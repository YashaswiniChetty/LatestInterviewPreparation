package GeneralPrograms;

import java.util.Arrays;

public class ArraysAreEqual {

	public static void main(String[] args) {
		int [] a1=new int[] {1,2,3,4,5};
		int []a2=new int[] {1,2,3,4,5};
		boolean isequal=true;
		/*if(Arrays.equals(a1, a2)) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}*/
     if(a1.length==a2.length) {
    	 for(int i=0;i<a1.length;i++) {
    		 if(a1[i]!=a2[i]) {
    			
    			isequal=false;
    			
    		 }
    	 }
    	 
     }else {
    	isequal=false;
     }
     if(isequal) {
		 System.out.println("identical");
	 }else {
		 System.out.println("not identical");
	 }
	}

}
