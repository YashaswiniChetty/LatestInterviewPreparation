import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test1s {

    public static void main(String[] args) {
        int [] arr= {10, 9,15,20,23,16,7,10,30};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]<arr[i+1]){
                System.out.println(arr[i-1]+"  "+ arr[i] + "  "+ arr[i+1]);
            }
        }
    }


}
