class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 ==1){
            return false;
        }
        Stack<Character> stack= new Stack<Character>();
        char CharArray[] = s.toCharArray();
        for(int i = 0 ; i<CharArray.length;i++){
            char c = CharArray[i];
            if(c == '('||c == '['||c == '{'){
                stack.push (c);
        }else{
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.peek();
            if( top == '(' && c == ')' || top == '[' && c == ']' || top == '{' && c == '}' ){
                   stack.pop();
               }else{
                   return false;
                }
            }
        }
        return stack.isEmpty();
    }
}