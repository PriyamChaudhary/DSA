class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        st.push(val);
        minStack.push(Math.min(val,minStack.peek()));
        
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        return -1;
       
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return Integer.MAX_VALUE;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */