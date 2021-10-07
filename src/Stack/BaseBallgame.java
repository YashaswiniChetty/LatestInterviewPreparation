package Stack;

import java.util.Stack;

public class BaseBallgame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String s:ops){
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }else if(s.equals("+")){
                int top=stack.pop();//1st previous
                int sum = top+stack.peek();//1st previous+second previous
                stack.push(top);//as we emoved ist again we need to add
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+= stack.pop();
        }
        return sum;
    }
}
