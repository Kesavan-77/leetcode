class CustomStack {
    
    private Stack<Integer> stack;
    private int maxSize = 0;
    
    public CustomStack(int maxSize) {
        this.stack = new Stack<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(this.stack.size()< this.maxSize){
            stack.push(x);
        }
    }
    
    public int pop() {
        if(this.stack.size()>0){
            return stack.pop();
        } else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<this.stack.size();i++){
            if(k>0){
                this.stack.set(i, this.stack.get(i) + val);
            } else{
                break;
            }
            k--;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */