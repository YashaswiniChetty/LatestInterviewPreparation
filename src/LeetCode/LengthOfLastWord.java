package LeetCode;

public class LengthOfLastWord {
    public  static int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("heloo world"));//11-5
    }

}
