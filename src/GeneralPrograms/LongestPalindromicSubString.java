package GeneralPrograms;
//Time complexity : O(n^2)
// ). Since expanding a palindrome around its center could take O(n)O(n) time, the overall complexity is O(n^2)O(n

//Space complexity : O(1)
public class LongestPalindromicSubString {

    public static String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        for (int i = 0; i <n ; i++) {
            int len1=extendFromMiddle(s,i,i);
            int len2=extendFromMiddle(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start) {
                start = i - (len - 1) / 2;
                end=i+(len/2);
            }
        }

        return s.substring(start,end+1);
    }

    private static int extendFromMiddle(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


    public static void main(String[] args) {

        String s="cbbd";
        /*int i = extendFromMiddle(s, 0, 1);*/
        String longestPalindrome = longestPalindrome(s);
        System.out.println(longestPalindrome);
    }
}
