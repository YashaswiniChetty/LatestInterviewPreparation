package Stack;

import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> stack= new Stack<>();
        for(char c:s.toCharArray()){
           /* if(!stack.isEmpty()&& (stack.peek()==c+32|| stack.peek()+32==c)){
                stack.pop();
            }else{
                stack.push(c);
            }*/

            if(!stack.isEmpty()&& Math.abs(stack.peek()-c)==32){//a 97 a 65 diff is 32 for all cases
                stack.pop();
            }else{
                stack.push(c);
            }


        }

            /*    char [] ch= new char[stack.size()];
        for(int i=stack.size()-1; i>= 0;i--){
            ch[i]=stack.pop();
        }
        return String.valueOf(ch);*/
        StringBuilder sb = new StringBuilder();
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
