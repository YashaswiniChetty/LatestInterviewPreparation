package GeneralPrograms;

public class OneMissingNumberInArray {

	public static void main(String[] args) {

      int [] in=new int[] {1,3,4,5,6,7,8};
      int expectedsum,totalcount=8;
      int actualsum=0;
      expectedsum=(totalcount*(totalcount+1)/2);
      System.out.println(expectedsum);
      for(int i:in) {
    	  actualsum=actualsum+i;
      }
      int missingnumber=expectedsum - actualsum;
      System.out.println(missingnumber);
      

	}

}
