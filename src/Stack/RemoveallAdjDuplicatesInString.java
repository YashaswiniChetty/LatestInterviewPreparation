package Stack;

import java.util.Stack;

public class RemoveallAdjDuplicatesInString {
    public static void main(String[] args) {
   System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        System.out.println(stack.toString());
        char [] ch= new char[stack.size()];
        for(int i=stack.size()-1; i>= 0;i--){
            ch[i]=stack.pop();
        }
        return String.valueOf(ch);
    }
}
