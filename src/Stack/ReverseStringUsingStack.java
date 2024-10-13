package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s="abcde";
        for(char c: s.toCharArray()){
            stack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.toString());
    }
}
