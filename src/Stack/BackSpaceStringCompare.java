package Stack;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack_s = new Stack<>();
        Stack<Character> stack_t = new Stack<>();
        for(char c: s.toCharArray() ){
            if(c=='#'){
                stack_s.pop();
            }else {
                stack_s.push(c);
            }
        }
        for(char c: t.toCharArray() ){
            if(c=='#'){
                stack_t.pop();
            }
            else {
                stack_t.push(c);
            }
        }
        if(stack_s.size()!=stack_t.size()){
            return false;
        }
        boolean flag=true;
        while (!stack_s.isEmpty() && !stack_t.isEmpty())
        {
            // If the top elements of both stacks
            // are same
            if (stack_s.peek() == stack_t.peek())
            {
                // Pop top of both stacks
                stack_s.pop();
                stack_t.pop();
            }
            else
            {
                flag=false;
                break;

            }
        }
        System.out.println(flag);
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }
}
