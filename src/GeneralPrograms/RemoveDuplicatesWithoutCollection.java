package GeneralPrograms;

public class RemoveDuplicatesWithoutCollection {
public static void main(String[] args) {
	int arr[] =new int[] {10,20,20,30,40,40};
	int n=arr.length;
    n=RemoveDuplicateElememnts(arr,n);
    for(int i=0;i<n;i++) {
    System.out.println(arr[i]);
    }
}

public static int RemoveDuplicateElememnts(int[] arr, int n) {

   if(n==0||n==1) {
	   return n;
	   }
   int j=0;
   for(int i=0;i<n-1;i++) {
	   if(arr[i]!=arr[i+1]) {
		   arr[j++]=arr[i];
	   }
   }
   arr[j++]=arr[n-1];
   return j;
   }
	
}
