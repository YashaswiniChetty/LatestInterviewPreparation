package DynamicProgramming;
//bottom up approach tabulation approch
public class FibonacciSeries {
    public static void main(String[] args) {
        int n=9;
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        System.out.println(fibonacciSeries.fibTabulation(n));
        System.out.println(fibonacciSeries.fibMemoization(n));
    }

    public  int fibTabulation(int n){
        int f[] = new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }

    public  int fibMemoization(int n){
        int f[] = new int[n+1];
        if(n<=1){
            f[n]=n;
        }
        for(int i=2;i<=n;i++){
            f[i]=fibMemoization(i-1)+fibMemoization(i-2);
        }
        return f[n];
    }
}
