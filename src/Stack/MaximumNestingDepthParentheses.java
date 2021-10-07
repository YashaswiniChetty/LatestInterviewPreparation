package Stack;

public class MaximumNestingDepthParentheses {
    public int maxDepth(String s) {
        int depth=0,open=0;
        for(char ch: s.toCharArray()) {
            if(ch=='('){
                open++;
            }
            if(ch==')'){
                open--;
            }
            depth= Math.max(depth,open);
        }
        return depth;
    }
}
