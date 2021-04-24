package HakerRank;
//11-11=0
/*124
  345
  456*/
public class DiagonalDifference {

    public static int diagonalDiff(int a[][]) {
        int leftSum = 0;
        int rightSum = 0;
        int len = a.length;
        for(int i = 0; i< len; i++){
            leftSum += a[i][i];
            rightSum += a[i][len-1-i];
        }
        return Math.abs(leftSum - rightSum);
    }

    public static void main (String [] args) {
        int a[][] ={{1,2,4}, {3,4,5}, {4,5,6}};
        System.out.println(diagonalDiff(a));
    }
}
