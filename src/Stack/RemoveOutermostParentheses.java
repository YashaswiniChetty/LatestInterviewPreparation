package Stack;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='('){
                if(stack.size()>0){
                    sb.append(ch);
                }
                stack.push(ch);
            }else{
                if(stack.size()>1){
                    sb.append(ch);
                }
                stack.pop();
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        System.out.println(removeOutermostParentheses.removeOuterParentheses("(()())()"));
    }
}
