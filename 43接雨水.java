class Solution {
    public int trap(int[] height) {
        if(height.length<=2){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(int i =0; i < height.length; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else if(height[stack.peek()] >= height[i]){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                    int bottom = stack.peek();//(存index)
                    stack.pop();
                    if(!stack.isEmpty()){
                        int h = Math.min(height[stack.peek()],height[i])-height[bottom];
                    int w = i - stack.peek() - 1;
                    res += h*w;
                    }
                }
                stack.push(i);
            }
        }
        return res;
    }
}
Console
