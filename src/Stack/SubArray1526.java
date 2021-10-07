package Stack;

public class SubArray1526 {
    public static void main(String[] args) {
        int target[] ={3,1,5,4,2};
      System.out.println(minNumberOperations(target));
    }
    public  static int minNumberOperations(int[] target) {
        int oprn=target[0];
        for(int i=1;i<target.length;i++){
            if(target[i]>target[i-1]){
                oprn+=target[i]-target[i-1];
            }
        }
        return oprn;
    }
}
