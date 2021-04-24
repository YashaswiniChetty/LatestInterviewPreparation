package HakerRank;

public class JumpingOnClouds {

    public static int minJumps (int a[]){
        int len = a.length;
        int count = -1;
        for(int i = 0; i<len;){
            if(i+2<len && a[i+2]==0){
                i++;
            }
            i++;
            count++;
        }
        return count;
    }

    public static void main (String [] args){
        int a[] = {0, 1, 0, 0, 1, 0};
        System.out.println(minJumps(a));
    }
}
