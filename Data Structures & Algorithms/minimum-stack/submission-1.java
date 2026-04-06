class MinStack {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(main.isEmpty())
        {
            min.push(val);
        }

        else
        {
            if(min.peek()>val)
                min.push(val);
            else
                min.push(min.peek());
        }
        main.push(val);
    }
    
    public void pop() {
        min.pop();
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
