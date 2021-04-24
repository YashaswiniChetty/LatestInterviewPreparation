package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int n =2;
        System.out.println(happyNumber(n));
    }

    public static boolean happyNumber(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int cur = n;
            int sum = 0;
            while (cur != 0) {
               int rem = cur%10;
               sum = sum+rem*rem;
               cur = cur/10;
            }
            if(set.contains(sum)){
                return false;
            }
            n = sum;
            set.add(n);
        }
        return true;

}}
