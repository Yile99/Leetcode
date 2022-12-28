class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int right;
        int left;
        int ans;
        for(String token : tokens){
            if("+".equals(token)){
                right = stack.pop();
                left = stack.pop();
                ans = left + right;
            }else if ("-".equals(token)){
                right = stack.pop();
                left = stack.pop();
                ans = left - right;
            }else if("*".equals(token)){
                right = stack.pop();
                left = stack.pop();
                ans = left * right;
            }else if("/".equals(token)){
                right = stack.pop();
                left = stack.pop();
                ans = left / right;
            }else{
                ans = Integer.valueOf(token);
            }
            stack.push(ans);
        }
        return stack.pop();
    }
}