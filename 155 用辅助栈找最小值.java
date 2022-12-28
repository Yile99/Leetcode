class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty()){
            if(val <= minStack.peek()){
            minStack.push(val);
            }
        }else{
            minStack.push(val);
        }
    }
    
    public void pop() {
        int pop = stack.pop();
        if(pop == minStack.peek()){
            minStack.pop();
        }

    }
    
    public int top() {
        int top = stack.peek();
        return top;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}