package GeneralPrograms;

public class RightAndLeftRotate {
	public static void main(String[] args) {
		/* left 40
		50
		10
		20
		30*/
		Integer [] arr= new Integer[]  {10,20,30,40,50};
		int noofrotation=2;
		for (int i = 0; i < noofrotation; i++) {
			for (int j = arr.length - 1; j >0; j--) {
		int temp = arr[j];
		arr[j] = arr[j - 1];
		arr[j - 1] = temp;
			}
			}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}



}
