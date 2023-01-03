class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int[] height = new int[matrix[0].length];
        for(int row = 0 ; row < matrix.length; row++){
            for(int col = 0 ; col < matrix[0].length; col++){
                if(matrix[row][col] == '1'){
                    height[col] += 1;
                }else{
                    height[col] = 0;
                }
            }
            maxArea = Math.max(maxArea,largestRectangleArea(height));
        }
        return maxArea;
    }


    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int[] newHeights = new int[heights.length+2];
        newHeights[0] = 0;
        newHeights[heights.length - 1] = 0;
        for(int i = 0 ; i < heights.length ; i++){
            newHeights[i+1] = heights[i];
        }
        for(int i = 0 ; i <newHeights.length ; i++){
            while(!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]){
                int cur = stack.pop();
                int curHeights = newHeights[cur];
                int leftIndex = stack.peek();
                int rightIndex = i;
                res = Math.max(res,curHeights*(rightIndex - leftIndex - 1));
            }
            stack.push(i);
        }
        return res;
    }