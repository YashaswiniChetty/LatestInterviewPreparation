package GeneralPrograms;

public class GCDandLCM {

	public static void main(String[] args) {
		int n1=72,n2 =120,GCD=1,LCM;
		
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				GCD=i;
			}
		}
		LCM=(n1*n2)/GCD;
		System.out.println(GCD);
		System.out.println(LCM);

	}

}
