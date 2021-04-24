package LeetCode;

public class ThridMaximum {
    public static void main(String[] args) {
        int a[] = {1,2 ,3 , 4};
        int max=0;
        int sec_max=0;
        int thrid_max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]>sec_max){
                sec_max=a[i];
            }
        }
    }

}
