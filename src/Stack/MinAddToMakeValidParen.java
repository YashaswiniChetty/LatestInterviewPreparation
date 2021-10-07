package Stack;

import java.util.Stack;

public class MinAddToMakeValidParen {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int add=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(stack.isEmpty() ||c!= stack.pop()){
                add++;
            }
        }
        if(!stack.isEmpty()){
            return stack.size()+add;
        }
        return add;
    }
}
