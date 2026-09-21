class MinStack {
    Stack<Integer> minStack ;
    Stack<Integer> stack=new Stack<>();


    public MinStack() {
       minStack=new Stack<>();
        
        
    }
    
    public void push(int val) {
        minStack.push( val);

        if(stack.isEmpty()|| val <= stack.peek()){
            stack.push( val);

        }
        
    }
    
    public void pop() {
        int s=minStack.pop();
        if(s ==stack.peek() ){
            stack.pop();
        }

        
    }
    
    public int top() {
        int b= minStack.peek();
        return b;   
        
    }
    
    public int getMin() {
      int a=stack.peek();
      return a;   
     
    }

}
