package GeneralPrograms;
import java.util.Arrays;
public class SeperateZerosandNonZerosMonveEnd {
public static void main(String[] args) {
		int [] inputArray= {10,0,8,0,0};
		  int counter = 0;
	  for (int i = 0; i < inputArray.length; i++) {
           if(inputArray[i] != 0)
	            {
                 inputArray[counter] = inputArray[i];
                 counter++;
	            }
	        }
	  while (counter < inputArray.length) {
          inputArray[counter] = 0;
          counter++;
      }
	  System.out.println(Arrays.toString(inputArray));

	}

}
