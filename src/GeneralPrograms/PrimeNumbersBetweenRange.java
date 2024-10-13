package GeneralPrograms;

public class PrimeNumbersBetweenRange {
	public static void main(String[] args) {

		  int n1=20,n2=120;
		  int count=0;
		  for(int i=n1;i<=n2;i++) {
			  
		  	for(int j=2;j<i;j++) {
		  		if(i%j==0) {
		  			count=0;
		  			break;
		  		}
		  		else {
		  			count=1;
		  		}
		  		
		  	}
		  	if(count==1) {
	  			System.out.println(i);
	  		}
	}}
}
